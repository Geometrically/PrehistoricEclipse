package me.geometrically.prehistoric.client.render;

import com.dabigjoe.obsidianAPI.render.RenderAnimated;
import me.geometrically.prehistoric.client.model.ModelDinosaur;
import me.geometrically.prehistoric.server.entity.EntityEgg;
import me.geometrically.prehistoric.server.entity.IGenderable;
import me.geometrically.prehistoric.server.entity.land.carnivore.EntityDakotaraptor;
import me.geometrically.prehistoric.server.entity.land.carnivore.EntityTyrannosaurusRex;
import me.geometrically.prehistoric.server.entity.land.carnivore.EntityVelociraptor;
import me.geometrically.prehistoric.server.entity.land.herbivore.EntityArthropleura;
import me.geometrically.prehistoric.server.entity.land.herbivore.EntityTitanoceratops;
import me.geometrically.prehistoric.server.entity.water.EntityDunkleosteus;
import me.geometrically.prehistoric.server.entity.water.EntityPlesiosaurus;
import me.geometrically.prehistoric.server.entity.water.EntitySaurichthys;
import me.geometrically.prehistoric.server.entity.water.EntitySeaScorpion;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

public class RenderDinosaur extends RenderAnimated{

    private ModelDinosaur model;

    public RenderDinosaur(ModelDinosaur model){
        super(model, 0.8F);
        this.model = model;
    }

    public RenderDinosaur(ModelDinosaur model, float shadowSize){
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
            GlStateManager.translate(0, 2.0F, 0);
            scaleFactor = 3.0F;
        } else if(entity instanceof EntitySeaScorpion){
            GlStateManager.translate(0, -0.5F, 0);
        }
        GlStateManager.scale(scaleFactor, scaleFactor, scaleFactor);
        if(entity instanceof EntityAgeable){
            EntityAgeable ageable = (EntityAgeable)entity;
            if(entity.isChild()){
                GlStateManager.scale(0.5F, 0.5F, 0.5F);
            } else {
                GlStateManager.scale(1.0F, 1.0F, 1.0F);
            }
        }
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity entity) {
        if(entity instanceof IGenderable){
            IGenderable dinosaur = (IGenderable) entity;
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
