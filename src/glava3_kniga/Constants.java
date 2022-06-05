package glava3_kniga;

public class Constants
{
    public static void main(String[] args)
    {
        final double CM_PER_INCH = 2.54; //final - обозначение константы
        double paperWidth = 8.5;
        double paperHeight = 11;
        paperWidth ++;
        paperHeight += 4;
        System.out.println("Paper size in centimeters: "
                            +paperWidth*CM_PER_INCH
                            +" by "+paperHeight*CM_PER_INCH);
        System.out.println (paperWidth);
        System.out.println (paperHeight);
    }
}
