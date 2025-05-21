
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);

        // implement the creation of a magic square with the Siamese method algorithm here
        int x=0;
        int y=size/2;
        int val=1;
        while (val<=size*size){
            square.placeValue(y, x, val);
            val++;
            int newX=x-1, newY=y+1;
            if (newX<0){
                newX=size-1;
            }
            if (newY>=size){
                newY=0;
            }
            if (square.readValue(newY, newX)!=0){
                newX=x+1;
                newY = y;
            }
            x=newX;
            y=newY;
        }
        return square;
    }

}
