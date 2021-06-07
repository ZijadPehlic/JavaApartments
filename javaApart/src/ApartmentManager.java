import java.util.Scanner;
public class ApartmentManager {
    public static void main (String[] args) {
        int option;
        int id=0;
        int option2=1;
        double avgRoomSizeM;
        int apartIDM,streetNumM,sizeSqMM,numOfRoomsM,numOfBedroomsM,numOfLivingrooomsM,numOfToiletsM,
                courtyardSizeM, balconySizeM,garageSizeM,sellPriceM;
        String ownerM, stateM, cityM, addressM;
        boolean hasCourtyardM=true, hasBalconyM, hasGarageM;


        apartIDM = id;
        id = id + 1;
        System.out.println("Add your apartment?\r");
        System.out.println("What is Your name?\r");
        Scanner ownerS = new Scanner(System.in);

        ownerM = ownerS.nextLine();
        System.out.println("Street number?\r");
        Scanner streetNumS = new Scanner(System.in);
        streetNumM = streetNumS.nextInt();
        System.out.println("State?\r");
        Scanner stateS = new Scanner(System.in);
        stateM = stateS.nextLine();
        System.out.println("City?\r");
        Scanner cityS = new Scanner(System.in);
        cityM = cityS.nextLine();
        System.out.println("adress?\r");
        Scanner adressS = new Scanner(System.in);
        addressM = adressS.nextLine();
        Scanner sizeS = new Scanner(System.in);
        System.out.println("Apartment size?\r");
        sizeSqMM = sizeS.nextInt();
        System.out.println("number of rooms\r");
        Scanner numOfRoomsS = new Scanner(System.in);
        numOfRoomsM = numOfRoomsS.nextInt();
        avgRoomSizeM = sizeSqMM/numOfRoomsM;
        System.out.println("number of bedrooms?\r");
        Scanner numOfBedS = new Scanner(System.in);
        numOfBedroomsM = numOfBedS.nextInt();
        System.out.println("number of livingrooms\r");
        Scanner numOfLS = new Scanner(System.in);
        numOfLivingrooomsM = numOfLS.nextInt();
        System.out.println("number of toiletes\r");
        Scanner numOfTS = new Scanner(System.in);
        numOfToiletsM = numOfTS.nextInt();
        System.out.println("Has courtyard?(Y=1 N=0)\r");
        Scanner hasCS = new Scanner(System.in);
        if (hasCS.nextInt()==1) {
            hasCourtyardM = true;

            System.out.println("Courtyard size\r");
            Scanner courtS = new Scanner(System.in);
            courtyardSizeM = courtS.nextInt();
        }  else {
            hasCourtyardM=false;
            courtyardSizeM=0;
        }
        System.out.println("Has balcony?\r");
        Scanner hasBS = new Scanner(System.in);
        if (hasBS.nextInt()==1) {
            hasBalconyM = true;
            System.out.println("Balcony size?\r");
            Scanner hasBSS = new Scanner(System.in);
            balconySizeM = hasBSS.nextInt();
        } else{
            hasBalconyM=false;
            balconySizeM =0;}
        System.out.println("has garage?\r");
        Scanner hasGS = new Scanner(System.in);
        if (hasGS.nextInt()==1) {
            hasGarageM = true;
            System.out.println("garage size\r");
            Scanner garageSS = new Scanner(System.in);
            garageSizeM = garageSS.nextInt();
        }  else {
            hasGarageM=false;
            garageSizeM=0;
        }
        System.out.println("Selling price?\r");
        Scanner sellPS = new Scanner(System.in);
        sellPriceM = sellPS.nextInt();
        Apartment apar = new Apartment(apartIDM,ownerM,streetNumM,stateM,cityM,addressM,sizeSqMM, numOfRoomsM,avgRoomSizeM,numOfBedroomsM,numOfLivingrooomsM,numOfToiletsM,hasCourtyardM,courtyardSizeM,hasBalconyM,balconySizeM,hasGarageM,garageSizeM,sellPriceM);

        System.out.println("Apartment succesfully added!");
        System.out.println(apar);
        do {
            System.out.println("What would You like to do next?\r");
            System.out.println("0.Exit!\r");
            System.out.println("1.Add balcony!\r");
            System.out.println("3.Add courtyard!\r");
            System.out.println("4.Remove courtyard!\r");

            Scanner optionS = new Scanner(System.in);
            option=optionS.nextInt();
            //Add balcony
            if(option==0) break;
            if(option==1) {
                System.out.println("Size of new balcony\r");
                Scanner sizeNS = new Scanner(System.in);
                apar.addBalcony(sizeNS.nextInt());
                System.out.println(apar);
            }

            //remove balcony
            if(option==2) {
                apar.removeBalcony();
                System.out.println("Balcony succesfully removed\r");
                System.out.println(apar);
            }

            //Add courtyard
            if(option==3) {
                System.out.println("Size of new courtyard\r");
                Scanner sizeNCS = new Scanner(System.in);
                apar.addCourtyard(sizeNCS.nextInt());
                System.out.println(apar);
            }
            if(option==4) {


                apar.removeCourtyard();
                System.out.println("Courtyard succesfully removed\r");
                System.out.println(apar);
            }
            if(option==5) {
                System.out.println("Size of new garage\r");
                Scanner sizeNCS = new Scanner(System.in);
                apar.addGarage(sizeNCS.nextInt());
                System.out.println(apar);
            }
            if(option==6) {
                apar.removeGarage();
                System.out.println("Garage succesfully removed\r");
                System.out.println(apar);
            }

            System.out.println("Do you want do something else?(if yes enter 1)");
            Scanner option2S = new Scanner(System.in);
            option2= option2S.nextInt();

        } while (option2==1);
    }


}
