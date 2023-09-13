package sefkesel.howlingsun.Gui.LibGui;

import io.github.cottonmc.cotton.gui.client.LightweightGuiDescription;
import io.github.cottonmc.cotton.gui.widget.WButton;
import io.github.cottonmc.cotton.gui.widget.WGridPanel;
import io.github.cottonmc.cotton.gui.widget.WLabel;
import io.github.cottonmc.cotton.gui.widget.data.HorizontalAlignment;
import io.github.cottonmc.cotton.gui.widget.data.VerticalAlignment;
import net.minecraft.text.Text;

public class ModMenu extends LightweightGuiDescription {
    public ModMenu(){

        WGridPanel root = new WGridPanel();
        setRootPanel(root);
        root.setSize(20,30);

        WLabel label = new WLabel(Text.literal("Stats"));
        root.add(label,0,0,4,2);
        label.setHorizontalAlignment(HorizontalAlignment.CENTER);
        label.setVerticalAlignment(VerticalAlignment.TOP);

        WButton button = new WButton(Text.literal("Boton"));
        button.setOnClick( () -> {
            // Asi se llama un paquete
            // ClientPlayNetworking.send(ModPackets.MENU_ID, PacketByteBufs.create());
            //
        });
        root.add(button, 2,2,10,20);

    }
}
