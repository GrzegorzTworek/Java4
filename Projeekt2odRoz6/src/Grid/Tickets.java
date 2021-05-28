package Grid;
//Notes
// You need to choose a type of the ticketnumber input parameter yourself
// The ticket number consists of 6 digits like 123456 or 404404
// The method returns true if the sum of the first three digits is equal to the sum of the last three digits.
// If the sums are different the method returns false
// e.g.
//123321=>1+2+3==3+2+1 =>true
//234436=>2+3+4!=4+3+6 =>false
public class Tickets {
    public static void main(String[] args){
        System.out.println("Hello Java");

        int[] ticket = {1,2,3,3,1,2};

        System.out.println(isMyTicketLucky(ticket));
    }
    static boolean isMyTicketLucky(int[] ticketNumber){

        if (ticketNumber.length != 6){
            return false;
        }

        boolean result = ticketNumber[0]+ticketNumber[1]+ticketNumber[2] == ticketNumber[3]+ticketNumber[4]+ticketNumber[5];


        return result;
    }
}
