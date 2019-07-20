
package ui;

import java.io.File;

import com.jfoenix.controls.JFXButton;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;

public class MainController {

	@FXML
	private AnchorPane pane3;

	@FXML
	private JFXButton showcontentBtn;

	@FXML
	private JFXButton solutionBtn;

	@FXML
	private JFXButton addFileBtn;

	@FXML
	private AnchorPane pane2;

	@FXML
	private AnchorPane pane1;

	@FXML
	private Button chooseFileBtn;

	@FXML
	void internalBtns(ActionEvent event) {

		if (event.getTarget() == chooseFileBtn) {
			FileChooser filechooser = new FileChooser();
			File file = filechooser.showOpenDialog(null);

		}
	}

	@FXML
	void sideBtns(MouseEvent event) {
		if (event.getTarget() == addFileBtn) {
			pane1.setVisible(true);
			pane2.setVisible(false);
			pane3.setVisible(false);

		} else if (event.getTarget() == showcontentBtn) {
			pane2.setVisible(true);
			pane1.setVisible(false);
			pane3.setVisible(false);
		} else if (event.getTarget() == solutionBtn) {
			pane3.setVisible(true);
			pane2.setVisible(false);
			pane1.setVisible(false);
		}
	}

}
