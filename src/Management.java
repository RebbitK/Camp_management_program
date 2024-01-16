import domain.StudentData;
import service.*;
import view.Input;

public class Management {

    private Register register;
    private Modify modify;
    private Information information;
    private Delete delete;
    private Avg_calculation avg_calculation;
    private ScoreInformation scoreInformation;
    private ScoreSystem scoreSystem;

    private StudentCreateRead studentCreateRead;

    public Management() {
        register = new Register();
        modify = new Modify();
        information = new Information();
        delete = new Delete();
        scoreSystem = new ScoreSystem();
    }

    // 실행할 때 해당 메서드를 중심으로 실행
    public void run() {
        while(true) {
            System.out.println("메인 화면입니다."); // 여기는 나중에 수정할 예정
            System.out.println("1. 등록하기    2. 수정하기    3. 조회하기    4. 삭제하기    5. 등급조회    0. 나가기");
            int number = Integer.parseInt(Input.inputNumber());

            switchCase(number);

            if(number==0)
                break;
        }

    }

    public void end() {
        System.out.println("종료되었습니다.");
    }

    private void switchCase(int number) {
        try {
            switch (number) {
                case 1:
                    System.out.println("수강생을 등록하겠습니까?");
                    StudentCreateRead.StudentCreate(); // 수강생 등록하기
                    break;
                    //등록시 이름+고유번호+과목이 좋을 것 같습니다! 고유번호 중복검사 부탁드리고 한명 등록시 바로 다시 등록말고 메인화면으로 갈 수 있게 부탁드립니다.
                case 2:
                    System.out.println("수강생을 수정하시겠습니까?");
                    scoreInformation.modify();        // 수강생 수정하기
                    break;
                    //현재 같이 사용하는 domain에 있는 StudentData에서 데이터를 가져오는 것이 아닌 개인으로 사용하시는 리스트에서 수정하시는 거라 다른 기능에서
                    //저장한 것은 수정이 불가능하고 갱신도 힘드네요 StudentData에서 정보를 가져와주세요!
                case 3:
                    System.out.println("수강생을 조회하시겠습니까?");
                    information.lookUpInformation(StudentData.getInstance().getStudents()); // 수강생 조회하기
                    break;
                case 4:
                    System.out.println("수강생을 삭제하시겠습니까?");
                    delete.deleteStudent(StudentData.getInstance().getStudents());
                    break;
                case 5:
                    avg_calculation.avg_screen(StudentData.getInstance().getStudents()); //예외처리
                    break;
                case 6:
                    System.out.println("수강생의 점수를 입력하시겠습니까?");
                    scoreInformation.insert(); //점수입력
                    break;
                default:
                    throw new service.out_of_range();
            }
        }catch (NullPointerException e){
            System.out.println("현재 수강생이 없습니다.");
        }catch(out_of_range e){
            System.out.println("선택번호에 없는 값 입니다.");
        }
    }
}
