public class RomanToInt
{
    public static int romanToInt(String str)
    {
        int result = 0, number = 0;
        for (int i = str.length()-1; i >= 0; i--)
        {
            switch(str.charAt(i))
            {
                case 'I': number = 1;
                break;
                case 'V': number = 5;
                break;
                case 'X': number = 10;
                break;
                case 'L': number = 50;
                break;
                case 'C': number = 100;
                break;
                case 'D': number = 500;
                break;
                case 'M': number= 1000;
                break;
            }
            if (4 * number < result)
                result -= number;
            else
                result += number;
        }
        return result;
    }

    public static void main(String[] args)
    {
        String str="LVIII";
        int integer=romanToInt(str);

        System.out.println("The Roman Number is: "+str);
        System.out.println("Its Integer Value is: "+integer);


    }
}
