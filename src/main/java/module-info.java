module es.uah.matcomp.mp.teoria.gui.mvc.javafx.trabajofinal {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens es.uah.matcomp.mp.teoria.gui.mvc.javafx.trabajofinal to javafx.fxml;
    exports es.uah.matcomp.mp.teoria.gui.mvc.javafx.trabajofinal;
}