package Assignment5;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 * this clss create GUI vending machine
 *
 * @author RIDHAM PATEL,000831171
 */
public class GuiClass extends Application {

    /**
     *Instance Variables for View Components and Model
     */
        private Label quantity;
        private Label price;
        private Label credit;
        private Label output1;
        private Label output2;
        private Label output3;
        private Label output4;
        private Label lbl1;
        private Label lbl2;
        private Label priceT;
        private TextField quantityT ;
        private TextField creditT;
        private  Button chocolateBtn;
        private Button drinkBtn;
        private VendingMachine vend;



    /**
     * refresh method to change color and set default
     * values
     */
        private void refresh(){
             quantityT.setText("0");
             creditT.setText("0");
            if(vend.getQuantity1() >= 15 ) {
                chocolateBtn.setStyle("-fx-background-color: green;-fx-text-fill:white;");
            }else if(vend.getQuantity1()>10  ) {
                chocolateBtn.setStyle("-fx-background-color: blue;-fx-text-fill:white;");
            }else if(vend.getQuantity1()>0  ) {
                chocolateBtn.setStyle("-fx-background-color: red;-fx-text-fill:white;");
            }

            if(vend.getQuantity2() >= 15 ) {
                drinkBtn.setStyle("-fx-background-color: green;-fx-text-fill:white;");
            }else if(vend.getQuantity2()>10  ) {
                drinkBtn.setStyle("-fx-background-color: blue;-fx-text-fill:white;");
            }else if(vend.getQuantity2()>0  ) {
                drinkBtn.setStyle("-fx-background-color: red;-fx-text-fill:white;");
            }
        }

    /**
     *  Private Event Handlers and Helper Methods
     *  for chocolate button
     * @param e
     */
        private void setOutput(ActionEvent e){
            int newCredit = Integer.parseInt(creditT.getText());
            vend.money(newCredit);

            if(vend.getCredit() >0){
                int newOutPut = Integer.parseInt(quantityT.getText());
                vend.setQuantity1(newOutPut);

                String msg1 = "Machine has " + vend.getQuantity1() + "  Chocolate";
                String msg2 = "Machine has " + vend.getQuantity2() + "  Soft Drink";
                String msg3 = "Your credit is " + vend.getCredit() + " $";
                String msg4 = "Thank you for your visit";
                output1.setText(msg1);
                output2.setText(msg2);
                output3.setText(msg3);
                output4.setText(msg4);

            }else{
                String msg1 = "Machine has " + vend.getQuantity1() + "  Chocolate";
                String msg2 = "Machine has " + vend.getQuantity2() + "  Soft Drink";
                String msg3 = "Your credit is too low to purchase" ;
                String msg4 = "Thank you for your visit";
                output1.setText(msg1);
                output2.setText(msg2);
                output3.setText(msg3);
                output4.setText(msg4);

            }
            refresh();
        }

    /**
     *  Private Event Handlers and Helper Methods
     *  for softdrink button
     * @param e
     */
        private void setOutput2(ActionEvent e){

            int newCredit=Integer.parseInt(creditT.getText());
            vend.money(newCredit);

            if(vend.getCredit() >0){
                int newOutPut = Integer.parseInt(quantityT.getText());
                vend.setQuantity2(newOutPut);

                String msg1= "Machine has "+ vend.getQuantity1() + "  Chocolate";
                String msg2= "Machine has "+ vend.getQuantity2() + "  Soft Drink";
                String msg3= "Your credit is " + vend.getCredit() + " $";
                String msg4= "Thank you for your visit";
                output1.setText(msg1);
                output2.setText(msg2);
                output3.setText(msg3);
                output4.setText(msg4);

            }else{
                String msg1 = "Machine has " + vend.getQuantity1() + "  Chocolate";
                String msg2 = "Machine has " + vend.getQuantity2() + "  Soft Drink";
                String msg3 = "Your credit is too low to purchase";
                String msg4 = "Thank you for your visit";
                output1.setText(msg1);
                output2.setText(msg2);
                output3.setText(msg3);
                output4.setText(msg4);
            }
            refresh();
        }
        /**
     * To create your components and the model and add event
     * handlers.
     *
     * @param stage The main stage
     * @throws Exception
     */
    @Override
    public void start(Stage stage) throws Exception {
        Pane root = new Pane();
        Scene scene = new Scene(root, 400, 400); // set the size here
        stage.setTitle("Vending Machine"); // set the window title here
        stage.setScene(scene);

    // TODO: Add your GUI-building code here

        /** 1. Create the model **/
            vend=new VendingMachine();

        /** 2. Create the GUI components **/
            lbl1=new Label("Chocolate : Quantity = 20 , credit = 10");
            lbl2=new Label(" Soft Drink: Quantity = 20 , credit = 10 ");
            chocolateBtn=new Button("Chocolate");
            drinkBtn=new Button("Soft Drink");
            quantity=new Label("Quantity  :");
            price=new Label("Price        :");
            credit=new Label("Credit      :");
            output1=new Label(" ");
            output2=new Label(" ");
            output3=new Label(" ");
            output4=new Label(" ");
            quantityT=new TextField("0");
            priceT=new Label("2");
            creditT=new TextField("0");

        /**  3. Add components to the root **/
             root.getChildren().addAll(chocolateBtn,drinkBtn,quantity,price,credit,quantityT,priceT,creditT,output3,output2,output1,lbl1,lbl2,output4);
        /**
         * 4. Configure the components (colors, fonts, size, location)
         */

            lbl1.relocate(20,20);
            lbl2.relocate(20,50);

            chocolateBtn.relocate(80,220);
            chocolateBtn.setPrefWidth(100);
            chocolateBtn.setPrefHeight(50);


            drinkBtn.relocate(250,220);
            drinkBtn.setPrefWidth(100);
            drinkBtn.setPrefHeight(50);


            quantity.relocate(50,80);
            quantity.setFont(new Font("System",15));
            quantityT.relocate(150,80);

            price.relocate(50,130);
            price.setFont(new Font("System",15));
            priceT.relocate(150,130);
            priceT.setFont(new Font("System",15));

            credit.relocate(50,180);
            credit.setFont(new Font("System",15));
            creditT.relocate(150,180);

            output1.relocate(30,275);
            output1.setFont(new Font("System",15));

            output2.relocate(30,300);
            output2.setFont(new Font("System",15));

            output3.relocate(30,325);
            output3.setFont(new Font("System",15));

            output4.relocate(100,350);
            output4.setFont(new Font("System",20));
        /**
         *  5. Add Event Handlers and do final setup
         */
            chocolateBtn.setOnAction(this::setOutput);
            refresh();
            drinkBtn.setOnAction(this::setOutput2);
            refresh();
        /**
         *  6. Show the stage
         */
            stage.show();
    }
    /**
     * Make no changes here.
     * @param args unused
     */
    public static void main(String[] args) {
        launch(args);
    }
}
