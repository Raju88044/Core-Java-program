public class Enum_example2 {

        public enum Enum_Exam {
            MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;
        }
    public static void main(String[] args) {
        
        Enum_Exam[] obj = Enum_Exam.values();
        for(int i = 0 ; i < obj.length; i++) {
            if(i == 1) {
            break;}
            else {
        switch(i) {
            case 1: 
            {
                System.out.println("It's 1 day of week" + ":" + obj[i].name());
                break;
            }
            case 2: 
            {
                System.out.println("It's 2 day of week" + ":" + obj[i].name());
                break;
            }
            case 3: 
            {
                System.out.println("It's 3 day of week" + ":" + obj[i].name());
                break;
            }case 4: 
            {
                System.out.println("It's 4 day of week" + ":" + obj[i].name());
                break;
            }
            case 5: 
            {
                System.out.println("It's friday weekend start day" + ":" + obj[i].name());
                break;
            }
            case 6: 
            {
                System.out.println("It's Saturday :-)" + ":" + obj[i].name());
                break;
            }
            case 7: 
            {
                System.out.println("It's Sunday :-)" + ":" + obj[i].name());
                break;
            }
            default:
            {
                System.out.println("Wrong input");
                break;
            }
        }
        }
    }

    }
}
