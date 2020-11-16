package micdoodle8.mods.galacticraft.core.client.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import micdoodle8.mods.galacticraft.core.entities.EntityMeteorChunk;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

public class ModelMeteorChunk extends EntityModel<EntityMeteorChunk>
{
    private final ModelRenderer[] boxes = new ModelRenderer[6];

    public ModelMeteorChunk()
    {
        textureWidth = 16;
        textureHeight = 16;

        boxes[0] = new ModelRenderer(this, 0, 0);
        boxes[0].addBox(0F, 0F, 0F, 1, 8, 6);
        boxes[0].setRotationPoint(4F, 0.0F, -5F);
        boxes[0].setTextureSize(16, 16);
        setRotation(boxes[0], -0F, -0F, -0F);
        boxes[0].mirror = false;
        boxes[1] = new ModelRenderer(this, 0, 0);
        boxes[1].addBox(0F, 0F, 0F, 5, 8, 1);
        boxes[1].setRotationPoint(-3F, 1.0F, -7F);
        boxes[1].setTextureSize(16, 16);
        setRotation(boxes[1], -0F, -0F, -0F);
        boxes[1].mirror = false;
        boxes[2] = new ModelRenderer(this, 0, 0);
        boxes[2].addBox(0F, 0F, 0F, 1, 8, 6);
        boxes[2].setRotationPoint(-6F, -1.0F, -5F);
        boxes[2].setTextureSize(16, 16);
        setRotation(boxes[2], -0F, -0F, -0F);
        boxes[2].mirror = false;
        boxes[3] = new ModelRenderer(this, 0, 0);
        boxes[3].addBox(0F, 0F, 0F, 6, 1, 5);
        boxes[3].setRotationPoint(-3F, -3.0F, -4F);
        boxes[3].setTextureSize(16, 16);
        setRotation(boxes[3], -0F, -0F, -0F);
        boxes[3].mirror = false;
        boxes[4] = new ModelRenderer(this, 0, 0);
        boxes[4].addBox(0F, 0F, 0F, 5, 8, 1);
        boxes[4].setRotationPoint(-3F, 0.0F, 3F);
        boxes[4].setTextureSize(16, 16);
        setRotation(boxes[4], -0F, -0F, -0F);
        boxes[4].mirror = false;
        boxes[5] = new ModelRenderer(this, 0, 0);
        boxes[5].addBox(0F, 0F, 0F, 9, 12, 9);
        boxes[5].setRotationPoint(-5F, -2.0F, -6F);
        boxes[5].setTextureSize(16, 16);
        setRotation(boxes[5], -0F, -0F, -0F);
        boxes[5].mirror = false;
    }

    @Override
    public void setRotationAngles(EntityMeteorChunk entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch)
    {

    }

    @Override
    public void render(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha)
    {
        for (ModelRenderer mr : boxes)
        {
            mr.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn);
        }
    }

    private void setRotation(ModelRenderer model, float x, float y, float z)
    {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
}
