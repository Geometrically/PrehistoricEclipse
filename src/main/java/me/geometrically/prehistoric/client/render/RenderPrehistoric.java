package me.geometrically.prehistoric.client.render;

import com.dabigjoe.obsidianAPI.render.RenderAnimated;
import me.geometrically.prehistoric.client.model.ModelPrehistoric;
import me.geometrically.prehistoric.server.entity.EntityEgg;
import me.geometrically.prehistoric.server.entity.EntityPrehistoric;
import me.geometrically.prehistoric.server.entity.aquatic.*;
import me.geometrically.prehistoric.server.entity.dinosaur.carnivore.EntityAllosaurus;
import me.geometrically.prehistoric.server.entity.dinosaur.carnivore.EntityDakotaraptor;
import me.geometrically.prehistoric.server.entity.dinosaur.carnivore.EntityTyrannosaurusRex;
import me.geometrically.prehistoric.server.entity.dinosaur.carnivore.EntityVelociraptor;
import me.geometrically.prehistoric.server.entity.dinosaur.herbivore.EntityArthropleura;
import me.geometrically.prehistoric.server.entity.dinosaur.herbivore.EntityPachycephalosaurus;
import me.geometrically.prehistoric.server.entity.dinosaur.herbivore.EntitySauroposeidon;
import me.geometrically.prehistoric.server.entity.dinosaur.herbivore.EntityTitanoceratops;
import me.geometrically.prehistoric.server.entity.flying.EntityDragonfly;
import me.geometrically.prehistoric.server.entity.flying.EntityTupandactylus;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

public class RenderPrehistoric extends RenderAnimated {

    private ModelPrehistoric model;

    public RenderPrehistoric(ModelPrehistoric model) {
        super(model, 0.8F);
        this.model = model;
    }

    public RenderPrehistoric(ModelPrehistoric model, float shadowSize) {
        super(model, shadowSize);
        this.model = model;
    }

    @Override
    protected void preRenderCallback(EntityLivingBase entity, float partialTickTime) {
        super.preRenderCallback(entity, partialTickTime);
        
        double scaleFactor = 1.0D;
        if(entity instanceof EntityDakotaraptor){
            scaleFactor = 0.8D;
            if(((EntityDakotaraptor) entity).isSitting()){
                GlStateManager.translate(0, -1F, 0);
            }
        } else if(entity instanceof EntityPlesiosaurus){
            scaleFactor = 0.50D;
        }  else if(entity instanceof EntityTitanoceratops) {
            scaleFactor = 1.5D;
        } else if(entity instanceof EntityVelociraptor){
            scaleFactor = 0.4D;
        } else if(entity instanceof EntityEgg){
            scaleFactor = 0.1D;
        } else if(entity instanceof EntityDunkleosteus){
            GlStateManager.translate(0, 2.0F, 0);
        } else if(entity instanceof EntityArthropleura){
            GlStateManager.translate(0, 0, -1.0F);
            scaleFactor = 1.5D;
        } else if(entity instanceof EntitySaurichthys){
            GlStateManager.translate(0, 0.5F, 0);
            scaleFactor = 0.50D;
        } else if(entity instanceof EntityTyrannosaurusRex){
            GlStateManager.translate(0, 2.5F, 0);
            scaleFactor = 3.3F;
        } else if(entity instanceof EntitySeaScorpion){
            GlStateManager.translate(0, -0.5F, 0);
        } else if (entity instanceof EntityPachycephalosaurus) {
            scaleFactor = 0.5F;
        } else if (entity instanceof EntityDragonfly) {
            GlStateManager.translate(0, 1.0F, 0);
        } else if (entity instanceof EntityTupandactylus) {
            GlStateManager.translate(0, 1.0F, 0);
        } else if (entity instanceof EntityAllosaurus){
            GlStateManager.translate(0, 1.8F, 0);
            scaleFactor= 2.3F;
        } else if (entity instanceof EntitySauroposeidon) {
            GlStateManager.translate(0, 2.0F, 0);
            scaleFactor = 2.5F;
        } else if (entity instanceof EntityOnchopristis) {
            GlStateManager.translate(0, 1.0F, 0);
        }
        GlStateManager.scale(scaleFactor, scaleFactor, scaleFactor);
        if(entity instanceof EntityAgeable){
            EntityAgeable ageable = (EntityAgeable)entity;
            if(entity.isChild()){
                GlStateManager.scale(0.5F, 0.5F, 0.5F);
                if (entity instanceof EntityTyrannosaurusRex || entity instanceof EntityAllosaurus || entity instanceof EntityDragonfly) {
                    GlStateManager.translate(0, -0.7F, 0);
                }
            } else {
                GlStateManager.scale(1.0F, 1.0F, 1.0F);
            }
        }
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity entity) {
        if (entity instanceof EntityPrehistoric) {
            EntityPrehistoric dinosaur = (EntityPrehistoric) entity;
            if(dinosaur.getVariant() == 1){
                model.setTexture(dinosaur.getVariantTexture());
                return dinosaur.getVariantTexture();
            } else {
                model.setTexture(dinosaur.getDefaultTexture());
                return dinosaur.getDefaultTexture();
            }
        } else {
            return super.getEntityTexture(entity);
        }
    }
}
