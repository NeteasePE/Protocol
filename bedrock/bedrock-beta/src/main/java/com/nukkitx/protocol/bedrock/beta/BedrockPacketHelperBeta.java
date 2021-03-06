package com.nukkitx.protocol.bedrock.beta;

import com.nukkitx.protocol.bedrock.data.LevelEventType;
import com.nukkitx.protocol.bedrock.v440.BedrockPacketHelper_v440;

public class BedrockPacketHelperBeta extends BedrockPacketHelper_v440 {
    public static final BedrockPacketHelperBeta INSTANCE = new BedrockPacketHelperBeta();

    @Override
    protected void registerLevelEvents() {
        int legacy = 0x4000;
        this.addLevelEvent(9 + legacy, LevelEventType.PARTICLE_CANDLE_FLAME);
        this.addLevelEvent(10 + legacy, LevelEventType.PARTICLE_LAVA);
        this.addLevelEvent(11 + legacy, LevelEventType.PARTICLE_LARGE_SMOKE);
        this.addLevelEvent(12 + legacy, LevelEventType.PARTICLE_REDSTONE);
        this.addLevelEvent(13 + legacy, LevelEventType.PARTICLE_RISING_RED_DUST);
        this.addLevelEvent(14 + legacy, LevelEventType.PARTICLE_ITEM_BREAK);
        this.addLevelEvent(15 + legacy, LevelEventType.PARTICLE_SNOWBALL_POOF);
        this.addLevelEvent(16 + legacy, LevelEventType.PARTICLE_HUGE_EXPLODE);
        this.addLevelEvent(17 + legacy, LevelEventType.PARTICLE_HUGE_EXPLODE_SEED);
        this.addLevelEvent(18 + legacy, LevelEventType.PARTICLE_MOB_FLAME);
        this.addLevelEvent(19 + legacy, LevelEventType.PARTICLE_HEART);
        this.addLevelEvent(20 + legacy, LevelEventType.PARTICLE_TERRAIN);
        this.addLevelEvent(21 + legacy, LevelEventType.PARTICLE_TOWN_AURA);
        this.addLevelEvent(22 + legacy, LevelEventType.PARTICLE_PORTAL);
        this.addLevelEvent(23 + legacy, LevelEventType.PARTICLE_MOB_PORTAL);
        this.addLevelEvent(24 + legacy, LevelEventType.PARTICLE_SPLASH);
        this.addLevelEvent(25 + legacy, LevelEventType.PARTICLE_SPLASH_MANUAL);
        this.addLevelEvent(26 + legacy, LevelEventType.PARTICLE_WATER_WAKE);
        this.addLevelEvent(27 + legacy, LevelEventType.PARTICLE_DRIP_WATER);
        this.addLevelEvent(28 + legacy, LevelEventType.PARTICLE_DRIP_LAVA);
        this.addLevelEvent(29 + legacy, LevelEventType.PARTICLE_FALLING_DUST);
        this.addLevelEvent(30 + legacy, LevelEventType.PARTICLE_MOB_SPELL);
        this.addLevelEvent(31 + legacy, LevelEventType.PARTICLE_MOB_SPELL_AMBIENT);
        this.addLevelEvent(32 + legacy, LevelEventType.PARTICLE_MOB_SPELL_INSTANTANEOUS);
        this.addLevelEvent(33 + legacy, LevelEventType.PARTICLE_INK);
        this.addLevelEvent(34 + legacy, LevelEventType.PARTICLE_SLIME);
        this.addLevelEvent(35 + legacy, LevelEventType.PARTICLE_RAIN_SPLASH);
        this.addLevelEvent(36 + legacy, LevelEventType.PARTICLE_VILLAGER_ANGRY);
        this.addLevelEvent(37 + legacy, LevelEventType.PARTICLE_VILLAGER_HAPPY);
        this.addLevelEvent(38 + legacy, LevelEventType.PARTICLE_ENCHANTMENT_TABLE);
        this.addLevelEvent(39 + legacy, LevelEventType.PARTICLE_TRACKING_EMITTER);
        this.addLevelEvent(40 + legacy, LevelEventType.PARTICLE_NOTE);
        this.addLevelEvent(41 + legacy, LevelEventType.PARTICLE_WITCH_SPELL);
        this.addLevelEvent(42 + legacy, LevelEventType.PARTICLE_CARROT);
        this.addLevelEvent(43 + legacy, LevelEventType.PARTICLE_MOB_APPEARANCE);
        this.addLevelEvent(44 + legacy, LevelEventType.PARTICLE_END_ROD);
        this.addLevelEvent(45 + legacy, LevelEventType.PARTICLE_DRAGONS_BREATH);
        this.addLevelEvent(46 + legacy, LevelEventType.PARTICLE_SPIT);
        this.addLevelEvent(47 + legacy, LevelEventType.PARTICLE_TOTEM);
        this.addLevelEvent(48 + legacy, LevelEventType.PARTICLE_FOOD);
        this.addLevelEvent(49 + legacy, LevelEventType.PARTICLE_FIREWORKS_STARTER);
        this.addLevelEvent(50 + legacy, LevelEventType.PARTICLE_FIREWORKS_SPARK);
        this.addLevelEvent(51 + legacy, LevelEventType.PARTICLE_FIREWORKS_OVERLAY);
        this.addLevelEvent(52 + legacy, LevelEventType.PARTICLE_BALLOON_GAS);
        this.addLevelEvent(53 + legacy, LevelEventType.PARTICLE_COLORED_FLAME);
        this.addLevelEvent(54 + legacy, LevelEventType.PARTICLE_SPARKLER);
        this.addLevelEvent(55 + legacy, LevelEventType.PARTICLE_CONDUIT);
        this.addLevelEvent(56 + legacy, LevelEventType.PARTICLE_BUBBLE_COLUMN_UP);
        this.addLevelEvent(57 + legacy, LevelEventType.PARTICLE_BUBBLE_COLUMN_DOWN);
        this.addLevelEvent(58 + legacy, LevelEventType.PARTICLE_SNEEZE);
    }
}
