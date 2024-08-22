package net.xiaoawaqi.mingxtfunmod.client.gui;

import net.xiaoawaqi.mingxtfunmod.world.inventory.Ccustomc4powerMenu;
import net.xiaoawaqi.mingxtfunmod.network.Ccustomc4powerButtonMessage;
import net.xiaoawaqi.mingxtfunmod.MingXtMod;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.Minecraft;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class Ccustomc4powerScreen extends AbstractContainerScreen<Ccustomc4powerMenu> {
	private final static HashMap<String, Object> guistate = Ccustomc4powerMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	EditBox c4power;
	Button button_wan_cheng;

	public Ccustomc4powerScreen(Ccustomc4powerMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 175;
		this.imageHeight = 77;
	}

	private static final ResourceLocation texture = new ResourceLocation("ming_xt:textures/screens/ccustomc_4power.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		c4power.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
		if (mouseX > leftPos + 29 && mouseX < leftPos + 150 && mouseY > topPos + 23 && mouseY < topPos + 41)
			guiGraphics.renderTooltip(font, Component.translatable("gui.ming_xt.ccustomc_4power.tooltip_qing_wu_bi_tian_xie_shu_zi"), mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		if (c4power.isFocused())
			return c4power.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
		c4power.tick();
	}

	@Override
	public void resize(Minecraft minecraft, int width, int height) {
		String c4powerValue = c4power.getValue();
		super.resize(minecraft, width, height);
		c4power.setValue(c4powerValue);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.ming_xt.ccustomc_4power.label_ding_yi_c4zha_dan_de_wei_li"), 42, 5, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		c4power = new EditBox(this.font, this.leftPos + 30, this.topPos + 24, 118, 18, Component.translatable("gui.ming_xt.ccustomc_4power.c4power")) {
			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.ming_xt.ccustomc_4power.c4power").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.ming_xt.ccustomc_4power.c4power").getString());
				else
					setSuggestion(null);
			}
		};
		c4power.setSuggestion(Component.translatable("gui.ming_xt.ccustomc_4power.c4power").getString());
		c4power.setMaxLength(32767);
		guistate.put("text:c4power", c4power);
		this.addWidget(this.c4power);
		button_wan_cheng = Button.builder(Component.translatable("gui.ming_xt.ccustomc_4power.button_wan_cheng"), e -> {
			if (true) {
				MingXtMod.PACKET_HANDLER.sendToServer(new Ccustomc4powerButtonMessage(0, x, y, z));
				Ccustomc4powerButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 69, this.topPos + 48, 35, 20).build();
		guistate.put("button:button_wan_cheng", button_wan_cheng);
		this.addRenderableWidget(button_wan_cheng);
	}
}
