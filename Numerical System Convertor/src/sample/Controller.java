package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable{
    @FXML
    private Pane root;

    @FXML
    private Label octOutput;

    @FXML
    private Button del;

    @FXML
    private Label number;

    @FXML
    private Label binOutput;

    @FXML
    private Label decOutput;

    @FXML
    private Label hexOutput;

    @FXML
    private Button num_2;

    @FXML
    private Button num_3;

    @FXML
    private Button num_4;

    @FXML
    private Button num_5;

    @FXML
    private Button num_6;

    @FXML
    private Button num_7;

    @FXML
    private Button num_8;

    @FXML
    private Button num_9;

    @FXML
    private Button hex_num_a;

    @FXML
    private Button hex_num_b;

    @FXML
    private Button hex_num_c;

    @FXML
    private Button hex_num_d;

    @FXML
    private Button hex_num_e;

    @FXML
    private Button hex_num_f;

    @FXML
    void clearInput(ActionEvent event) {
        ButtonAction.clearInput();
        action();
        number.setText(Main.answer);
    }

    @FXML
    void del(ActionEvent event) {
        ButtonAction.del();
        number.setText(Main.answer);
        action();

    }

    @FXML
    void butDivide(ActionEvent event) {
        ButtonAction.div();
    }

    @FXML
    void but_B(ActionEvent event) {
        if(Main.answer.length() < 18) {
            if (Main.state == Main.STATE.HEX) {
                ButtonAction.button_b();
                number.setText(Main.answer);
                action();
            }
        }
    }

    @FXML
    void clear(ActionEvent event) {
        ButtonAction.clear();
        binOutput.setText("   BIN: \t" + Main.answer);
        hexOutput.setText("   HEX: \t" + Main.answer);
        octOutput.setText("   OCT: \t" + Main.answer);
        decOutput.setText("   DEC: \t" + Main.answer);
        number.setText(Main.answer);
    }

    @FXML
    void but_2(ActionEvent event) {
        if(Main.answer.length() < 18) {
            if (!(Main.state == Main.STATE.BINARY)) {
                ButtonAction.button_2();
                number.setText(Main.answer);
                action();
            }
        }
    }

    @FXML
    void but_1(ActionEvent event) {
        if(Main.answer.length() < 18) {
            ButtonAction.button_1();
            number.setText(Main.answer);
            action();
        }
    }

    @FXML
    void but_F(ActionEvent event) {
        if(Main.state == Main.STATE.HEX) {
            ButtonAction.button_f();
            number.setText(Main.answer);
            action();
        }
    }

    @FXML
    void but_E(ActionEvent event) {
        if(Main.answer.length() < 18) {
            if (Main.state == Main.STATE.HEX) {
                ButtonAction.button_e();
                number.setText(Main.answer);
                action();
            }
        }
    }

    @FXML
    void butSub(ActionEvent event) {
        ButtonAction.minus();
    }

    @FXML
    void but_6(ActionEvent event) {
        if(Main.answer.length() < 18) {
            if (!(Main.state == Main.STATE.BINARY)) {
                ButtonAction.button_6();
                number.setText(Main.answer);
                action();
            }
        }
    }

    @FXML
    void but_5(ActionEvent event) {
        if(Main.answer.length() < 18) {
            if (!(Main.state == Main.STATE.BINARY)) {
                ButtonAction.button_5();
                number.setText(Main.answer);
                action();
            }
        }
    }

    @FXML
    void but_4(ActionEvent event) {
        if (Main.answer.length() < 18) {
            if (!(Main.state == Main.STATE.BINARY)) {
                ButtonAction.button_4();
                number.setText(Main.answer);
                action();
            }
        }
    }

    @FXML
    void but_D(ActionEvent event) {
        if(Main.answer.length() < 18) {
            if (Main.state == Main.STATE.HEX) {
                ButtonAction.button_d();
                number.setText(Main.answer);
                action();
            }
        }
    }

    @FXML
    void but_C(ActionEvent event) {
        if(Main.answer.length() < 18) {
            if (Main.state == Main.STATE.HEX) {
                ButtonAction.button_c();
                number.setText(Main.answer);
                action();
            }
        }
    }

    @FXML
    void butMult(ActionEvent event) {
        ButtonAction.multi();
    }

    @FXML
    void but_9(ActionEvent event) {
        if(Main.answer.length() < 18) {
            if (!(Main.state == Main.STATE.BINARY)) {
                ButtonAction.button_9();
                number.setText(Main.answer);
                action();
            }
        }
    }

    @FXML
    void but_8(ActionEvent event) {
        if(Main.answer.length() < 18) {
            if (!(Main.state == Main.STATE.BINARY)) {
                ButtonAction.button_8();
                number.setText(Main.answer);
                action();
            }
        }
    }

    @FXML
    void but_7(ActionEvent event) {
        if(Main.answer.length() < 18) {
            if (!(Main.state == Main.STATE.BINARY)) {
                ButtonAction.button_7();
                number.setText(Main.answer);
                action();
            }
        }
    }

    @FXML
    void but_A(ActionEvent event) {
        if(Main.answer.length() < 18) {
            if (Main.state == Main.STATE.HEX) {
                ButtonAction.button_a();
                number.setText(Main.answer);
                action();
            }
        }
    }

    @FXML
    void butEquals(ActionEvent event) {
        ButtonAction.buttonEquals();
    }

    @FXML
    void but_0(ActionEvent event) {
        if(Main.answer.length() < 18) {
            ButtonAction.button_0();
            number.setText(Main.answer);
            action();
        }
    }

    @FXML
    void negative(ActionEvent event) {
        ButtonAction.negate();
    }

    @FXML
    void butPlus(ActionEvent event) {
        ButtonAction.plus();
    }

    @FXML
    void but_3(ActionEvent event) {
        if(Main.answer.length() < 18) {
            if (!(Main.state == Main.STATE.BINARY)) {
                ButtonAction.button_3();
                number.setText(Main.answer);
                action();
            }
        }
    }

    @FXML
    void stateToHexOut(MouseEvent event) {
        if(event.getSource() == hexOutput) {
            Main.state = Main.STATE.HEX;
            hex_num_a.setTextFill(Color.BLACK);
            hex_num_b.setTextFill(Color.BLACK);
            hex_num_c.setTextFill(Color.BLACK);
            hex_num_d.setTextFill(Color.BLACK);
            hex_num_e.setTextFill(Color.BLACK);
            hex_num_f.setTextFill(Color.BLACK);
            num_9.setTextFill(Color.BLACK);
            num_8.setTextFill(Color.BLACK);
            num_7.setTextFill(Color.BLACK);
            num_6.setTextFill(Color.BLACK);
            num_5.setTextFill(Color.BLACK);
            num_4.setTextFill(Color.BLACK);
            num_3.setTextFill(Color.BLACK);
            num_2.setTextFill(Color.BLACK);
        }
    }

    @FXML
    void stateToDecOut(MouseEvent event) {
        if(event.getSource() == decOutput) {
            Main.state = Main.STATE.DECIMAL;
            hex_num_a.setTextFill(Color.LIGHTGRAY);
            hex_num_b.setTextFill(Color.LIGHTGRAY);
            hex_num_c.setTextFill(Color.LIGHTGRAY);
            hex_num_d.setTextFill(Color.LIGHTGRAY);
            hex_num_e.setTextFill(Color.LIGHTGRAY);
            hex_num_f.setTextFill(Color.LIGHTGRAY);
            num_9.setTextFill(Color.BLACK);
            num_8.setTextFill(Color.BLACK);
            num_7.setTextFill(Color.BLACK);
            num_6.setTextFill(Color.BLACK);
            num_5.setTextFill(Color.BLACK);
            num_4.setTextFill(Color.BLACK);
            num_3.setTextFill(Color.BLACK);
            num_2.setTextFill(Color.BLACK);
        }
    }

    @FXML
    void stateToOctOut(MouseEvent event) {
        if(event.getSource() == octOutput) {
            Main.state = Main.STATE.OCTAL;
            hex_num_a.setTextFill(Color.LIGHTGRAY);
            hex_num_b.setTextFill(Color.LIGHTGRAY);
            hex_num_c.setTextFill(Color.LIGHTGRAY);
            hex_num_d.setTextFill(Color.LIGHTGRAY);
            hex_num_e.setTextFill(Color.LIGHTGRAY);
            hex_num_f.setTextFill(Color.LIGHTGRAY);
            num_9.setTextFill(Color.LIGHTGRAY);
            num_8.setTextFill(Color.BLACK);
            num_7.setTextFill(Color.BLACK);
            num_6.setTextFill(Color.BLACK);
            num_5.setTextFill(Color.BLACK);
            num_4.setTextFill(Color.BLACK);
            num_3.setTextFill(Color.BLACK);
            num_2.setTextFill(Color.BLACK);

        }
    }

    @FXML
    void stateToBinOut(MouseEvent event) {
        if(event.getSource() == binOutput) {
            Main.state = Main.STATE.BINARY;
            hex_num_a.setTextFill(Color.LIGHTGRAY);
            hex_num_b.setTextFill(Color.LIGHTGRAY);
            hex_num_c.setTextFill(Color.LIGHTGRAY);
            hex_num_d.setTextFill(Color.LIGHTGRAY);
            hex_num_e.setTextFill(Color.LIGHTGRAY);
            hex_num_f.setTextFill(Color.LIGHTGRAY);
            num_9.setTextFill(Color.LIGHTGRAY);
            num_8.setTextFill(Color.LIGHTGRAY);
            num_7.setTextFill(Color.LIGHTGRAY);
            num_6.setTextFill(Color.LIGHTGRAY);
            num_5.setTextFill(Color.LIGHTGRAY);
            num_4.setTextFill(Color.LIGHTGRAY);
            num_3.setTextFill(Color.LIGHTGRAY);
            num_2.setTextFill(Color.LIGHTGRAY);
        }
    }
    @FXML
    void keyPressed(KeyEvent event) {
        if(Main.answer.length() < 18) {
            if (event.getCode() == KeyCode.NUMPAD0) {
                ButtonAction.button_0();
                number.setText(Main.answer);
                action();
            }
            if (event.getCode() == KeyCode.NUMPAD1) {
                ButtonAction.button_1();
                number.setText(Main.answer);
                action();
            }
            if (!(Main.state == Main.STATE.BINARY)) {
                if (event.getCode() == KeyCode.NUMPAD2) {
                    ButtonAction.button_2();
                    number.setText(Main.answer);
                    action();
                }
                if (event.getCode() == KeyCode.NUMPAD3) {
                    ButtonAction.button_3();
                    number.setText(Main.answer);
                    action();
                }
                if (event.getCode() == KeyCode.NUMPAD4) {
                    ButtonAction.button_4();
                    number.setText(Main.answer);
                    action();
                }
                if (event.getCode() == KeyCode.NUMPAD5) {
                    ButtonAction.button_5();
                    number.setText(Main.answer);
                    action();
                }
                if (event.getCode() == KeyCode.NUMPAD6) {
                    ButtonAction.button_6();
                    number.setText(Main.answer);
                    action();
                }
                if (event.getCode() == KeyCode.NUMPAD7) {
                    ButtonAction.button_7();
                    number.setText(Main.answer);
                    action();
                }
                if (event.getCode() == KeyCode.NUMPAD8) {
                    ButtonAction.button_8();
                    number.setText(Main.answer);
                    action();
                }
                if (!(Main.state == Main.STATE.OCTAL)) {
                    if (event.getCode() == KeyCode.NUMPAD9) {
                        ButtonAction.button_9();
                        number.setText(Main.answer);
                        action();
                    }
                }
            }
            if (Main.state == Main.STATE.HEX) {
                if (event.getCode() == KeyCode.A) {
                    ButtonAction.button_a();
                    number.setText(Main.answer);
                    action();
                }
                if (event.getCode() == KeyCode.B) {
                    ButtonAction.button_b();
                    number.setText(Main.answer);
                    action();
                }
                if (event.getCode() == KeyCode.C) {
                    ButtonAction.button_c();
                    number.setText(Main.answer);
                    action();
                }
                if (event.getCode() == KeyCode.D) {
                    ButtonAction.button_d();
                    number.setText(Main.answer);
                    action();
                }
                if (event.getCode() == KeyCode.E) {
                    ButtonAction.button_e();
                    number.setText(Main.answer);
                    action();
                }
                if (event.getCode() == KeyCode.F) {
                    ButtonAction.button_f();
                    number.setText(Main.answer);
                    action();
                }

            }
        }
        if(event.getCode() == KeyCode.BACK_SPACE){
            ButtonAction.del();
            number.setText(Main.answer);
            action();
        }
        if(event.getCode() == KeyCode.DELETE){
            ButtonAction.clearInput();
            number.setText(Main.answer);
            action();
        }
        if(event.getCode() == KeyCode.ENTER){
            ButtonAction.buttonEquals();
            action();
            number.setText(Main.answer);
        }
        if(event.getCode() == KeyCode.ADD){
            ButtonAction.plus();
        }
        if(event.getCode() == KeyCode.SUBTRACT){
            ButtonAction.minus();
        }
        if(event.getCode() == KeyCode.DIVIDE){
            ButtonAction.div();
        }
        if(event.getCode() == KeyCode.MULTIPLY){
            ButtonAction.multi();
        }
    }

    @FXML
    private GridPane buttonRoot;

    @Override
    public void initialize(URL url, ResourceBundle rb){
        number.setAlignment(Pos.CENTER_RIGHT);
        number.setText(Main.answer);
        hexOutput.setText("   HEX: \t" + Main.answer);
        decOutput.setText("   DEC: \t" + Main.answer);
        octOutput.setText("   OCT: \t" + Main.answer);
        binOutput.setText("   BIN: \t" + Main.answer);

        if(!(Main.state == Main.STATE.HEX)){
            hex_num_a.setTextFill(Color.LIGHTGRAY);
            hex_num_b.setTextFill(Color.LIGHTGRAY);
            hex_num_c.setTextFill(Color.LIGHTGRAY);
            hex_num_d.setTextFill(Color.LIGHTGRAY);
            hex_num_e.setTextFill(Color.LIGHTGRAY);
            hex_num_f.setTextFill(Color.LIGHTGRAY);

        }

        //Getting style ready...
        root.getStyleClass().add("root");
        buttonRoot.getStyleClass().add("button");
        del.getStyleClass().add("del");
    }

    private void action(){
            if (Main.state == Main.STATE.DECIMAL) {
                converter();
                binOutput.setText("   BIN: \t" + Action.binAns);
                octOutput.setText("   OCT: \t" + Action.octAns);
                hexOutput.setText("   HEX: \t" + Action.hexAns);
                decOutput.setText("   DEC: \t" + Main.answer);
            }
            if (Main.state == Main.STATE.HEX) {
                Action.hexToDec(Main.answer);
                converter();
                binOutput.setText("   BIN: \t" + Action.binAns);
                octOutput.setText("   OCT: \t" + Action.octAns);
                decOutput.setText("   DEC: \t" + Action.decAns);
                hexOutput.setText("   HEX: \t" + Main.answer);
            }
            if (Main.state == Main.STATE.OCTAL) {
                Action.octToDec(Main.answer);
                converter();
                binOutput.setText("   BIN: \t" + Action.binAns);
                octOutput.setText("   OCT: \t" + Main.answer);
                decOutput.setText("   DEC: \t" + Action.decAns);
                hexOutput.setText("   HEX: \t" + Action.hexAns);
            }
            if (Main.state == Main.STATE.BINARY) {
                Action.binToDec(Main.answer);
                converter();
                binOutput.setText("   BIN: \t" + Main.answer);
                octOutput.setText("   OCT: \t" + Action.octAns);
                hexOutput.setText("   HEX: \t" + Action.hexAns);
                decOutput.setText("   DEC: \t" + Action.decAns);
            }

    }
    private static void converter(){
        if(Main.state == Main.STATE.DECIMAL) {
            Action.toBinary(Long.parseLong(Main.answer));
            Action.toOctal(Long.parseLong(Main.answer));
            Action.toHex(Long.parseLong(Main.answer));
        }
        if(Main.state == Main.STATE.HEX){
            Action.toOctal(Long.parseLong(Action.decAns));
            Action.toBinary(Long.parseLong(Action.decAns));
        }
        if(Main.state == Main.STATE.OCTAL){
            Action.toHex(Long.parseLong(Action.decAns));
            Action.toBinary(Long.parseLong(Action.decAns));
        }
        if(Main.state == Main.STATE.BINARY){
            Action.toOctal(Long.parseLong(Action.decAns));
            Action.toHex(Long.parseLong(Action.decAns));
        }
    }
}
