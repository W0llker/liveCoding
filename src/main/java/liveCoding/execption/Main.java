package liveCoding.execption;

public class Main {
    static void main() throws CustomException {
//        int a = 5;
//        int b = 3;
//        //позволяет нам ловить наши ошибки
//        try {
//            if (a > b)
//                throw new CustomException("a < b");
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//        //позволят выбрасивать анчек исключение таким образом (предыдущий метод для cheaked exciption)
//        throw new RuntimeException("Уяпс");

        try {
            ExceptionTest.exceptionTest();
        } catch (CustomException e) {
            throw new RuntimeException(e);
        }
    }
}
