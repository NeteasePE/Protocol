package com.nukkitx.protocol.bedrock.v332;

import com.nukkitx.protocol.bedrock.BedrockPacketCodec;
import com.nukkitx.protocol.bedrock.packet.*;
import com.nukkitx.protocol.bedrock.v291.serializer.*;
import com.nukkitx.protocol.bedrock.v313.serializer.*;
import com.nukkitx.protocol.bedrock.v332.serializer.*;
import lombok.experimental.UtilityClass;

@UtilityClass
public class Bedrock_v332 {
    public static BedrockPacketCodec V332_CODEC = BedrockPacketCodec.builder()
            .protocolVersion(332)
            .minecraftVersion("1.9.0")
            .helper(BedrockPacketHelper_v332.INSTANCE)
            .registerPacket(LoginPacket.class, LoginSerializer_v291.INSTANCE, 1)
            .registerPacket(PlayStatusPacket.class, PlayStatusSerializer_v291.INSTANCE, 2)
            .registerPacket(ServerToClientHandshakePacket.class, ServerToClientHandshakeSerializer_v291.INSTANCE, 3)
            .registerPacket(ClientToServerHandshakePacket.class, ClientToServerHandshakeSerializer_v291.INSTANCE, 4)
            .registerPacket(DisconnectPacket.class, DisconnectSerializer_v291.INSTANCE, 5)
            .registerPacket(ResourcePacksInfoPacket.class, ResourcePacksInfoSerializer_v332.INSTANCE, 6)
            .registerPacket(ResourcePackStackPacket.class, ResourcePackStackSerializer_v313.INSTANCE, 7)
            .registerPacket(ResourcePackClientResponsePacket.class, ResourcePackClientResponseSerializer_v291.INSTANCE, 8)
            .registerPacket(TextPacket.class, TextSerializer_v332.INSTANCE, 9)
            .registerPacket(SetTimePacket.class, SetTimeSerializer_v291.INSTANCE, 10)
            .registerPacket(StartGamePacket.class, StartGameSerializer_v332.INSTANCE, 11)
            .registerPacket(AddPlayerPacket.class, AddPlayerSerializer_v291.INSTANCE, 12)
            .registerPacket(AddEntityPacket.class, AddEntitySerializer_v313.INSTANCE, 13)
            .registerPacket(RemoveEntityPacket.class, RemoveEntitySerializer_v291.INSTANCE, 14)
            .registerPacket(AddItemEntityPacket.class, AddItemEntitySerializer_v291.INSTANCE, 15)
            .registerPacket(AddHangingEntityPacket.class, AddHangingEntitySerializer_v291.INSTANCE, 16)
            .registerPacket(TakeItemEntityPacket.class, TakeItemEntitySerializer_v291.INSTANCE, 17)
            .registerPacket(MoveEntityAbsolutePacket.class, MoveEntityAbsoluteSerializer_v291.INSTANCE, 18)
            .registerPacket(MovePlayerPacket.class, MovePlayerSerializer_v291.INSTANCE, 19)
            .registerPacket(RiderJumpPacket.class, RiderJumpSerializer_v291.INSTANCE, 20)
            .registerPacket(UpdateBlockPacket.class, UpdateBlockSerializer_v291.INSTANCE, 21)
            .registerPacket(AddPaintingPacket.class, AddPaintingSerializer_v332.INSTANCE, 22)
            .registerPacket(ExplodePacket.class, ExplodeSerializer_v291.INSTANCE, 23)
            .registerPacket(LevelSoundEvent1Packet.class, LevelSoundEvent1Serializer_v291.INSTANCE, 24)
            .registerPacket(LevelEventPacket.class, LevelEventSerializer_v291.INSTANCE, 25)
            .registerPacket(BlockEventPacket.class, BlockEventSerializer_v291.INSTANCE, 26)
            .registerPacket(EntityEventPacket.class, EntityEventSerializer_v291.INSTANCE, 27)
            .registerPacket(MobEffectPacket.class, MobEffectSerializer_v291.INSTANCE, 28)
            .registerPacket(UpdateAttributesPacket.class, UpdateAttributesSerializer_v291.INSTANCE, 29)
            .registerPacket(InventoryTransactionPacket.class, InventoryTransactionSerializer_v291.INSTANCE, 30)
            .registerPacket(MobEquipmentPacket.class, MobEquipmentSerializer_v291.INSTANCE, 31)
            .registerPacket(MobArmorEquipmentPacket.class, MobArmorEquipmentSerializer_v291.INSTANCE, 32)
            .registerPacket(InteractPacket.class, InteractSerializer_v291.INSTANCE, 33)
            .registerPacket(BlockPickRequestPacket.class, BlockPickRequestSerializer_v291.INSTANCE, 34)
            .registerPacket(EntityPickRequestPacket.class, EntityPickRequestSerializer_v291.INSTANCE, 35)
            .registerPacket(PlayerActionPacket.class, PlayerActionSerializer_v291.INSTANCE, 36)
            .registerPacket(EntityFallPacket.class, EntityFallSerializer_v291.INSTANCE, 37)
            .registerPacket(HurtArmorPacket.class, HurtArmorSerializer_v291.INSTANCE, 38)
            .registerPacket(SetEntityDataPacket.class, SetEntityDataSerializer_v291.INSTANCE, 39)
            .registerPacket(SetEntityMotionPacket.class, SetEntityMotionSerializer_v291.INSTANCE, 40)
            .registerPacket(SetEntityLinkPacket.class, SetEntityLinkSerializer_v291.INSTANCE, 41)
            .registerPacket(SetHealthPacket.class, SetHealthSerializer_v291.INSTANCE, 42)
            .registerPacket(SetSpawnPositionPacket.class, SetSpawnPositionSerializer_v291.INSTANCE, 43)
            .registerPacket(AnimatePacket.class, AnimateSerializer_v291.INSTANCE, 44)
            .registerPacket(RespawnPacket.class, RespawnSerializer_v291.INSTANCE, 45)
            .registerPacket(ContainerOpenPacket.class, ContainerOpenSerializer_v291.INSTANCE, 46)
            .registerPacket(ContainerClosePacket.class, ContainerCloseSerializer_v291.INSTANCE, 47)
            .registerPacket(PlayerHotbarPacket.class, PlayerHotbarSerializer_v291.INSTANCE, 48)
            .registerPacket(InventoryContentPacket.class, InventoryContentSerializer_v291.INSTANCE, 49)
            .registerPacket(InventorySlotPacket.class, InventorySlotSerializer_v291.INSTANCE, 50)
            .registerPacket(ContainerSetDataPacket.class, ContainerSetDataSerializer_v291.INSTANCE, 51)
            .registerPacket(CraftingDataPacket.class, CraftingDataSerializer_v291.INSTANCE, 52)
            .registerPacket(CraftingEventPacket.class, CraftingEventSerializer_v291.INSTANCE, 53)
            .registerPacket(GuiDataPickItemPacket.class, GuiDataPickItemSerializer_v291.INSTANCE, 54)
            .registerPacket(AdventureSettingsPacket.class, AdventureSettingsSerializer_v291.INSTANCE, 55)
            .registerPacket(BlockEntityDataPacket.class, BlockEntityDataSerializer_v291.INSTANCE, 56)
            .registerPacket(PlayerInputPacket.class, PlayerInputSerializer_v291.INSTANCE, 57)
            .registerPacket(LevelChunkPacket.class, FullChunkDataSerializer_v291.INSTANCE, 58)
            .registerPacket(SetCommandsEnabledPacket.class, SetCommandsEnabledSerializer_v291.INSTANCE, 59)
            .registerPacket(SetDifficultyPacket.class, SetDifficultySerializer_v291.INSTANCE, 60)
            .registerPacket(ChangeDimensionPacket.class, ChangeDimensionSerializer_v291.INSTANCE, 61)
            .registerPacket(SetPlayerGameTypePacket.class, SetPlayerGameTypeSerializer_v291.INSTANCE, 62)
            .registerPacket(PlayerListPacket.class, PlayerListSerializer_v291.INSTANCE, 63)
            .registerPacket(SimpleEventPacket.class, SimpleEventSerializer_v291.INSTANCE, 64)
            .registerPacket(EventPacket.class, EventSerializer_v332.INSTANCE, 65)
            .registerPacket(SpawnExperienceOrbPacket.class, SpawnExperienceOrbSerializer_v291.INSTANCE, 66)
            .registerPacket(ClientboundMapItemDataPacket.class, ClientboundMapItemDataSerializer_v291.INSTANCE, 67)
            .registerPacket(MapInfoRequestPacket.class, MapInfoRequestSerializer_v291.INSTANCE, 68)
            .registerPacket(RequestChunkRadiusPacket.class, RequestChunkRadiusSerializer_v291.INSTANCE, 69)
            .registerPacket(ChunkRadiusUpdatedPacket.class, ChunkRadiusUpdatedSerializer_v291.INSTANCE, 70)
            .registerPacket(ItemFrameDropItemPacket.class, ItemFrameDropItemSerializer_v291.INSTANCE, 71)
            .registerPacket(GameRulesChangedPacket.class, GameRulesChangedSerializer_v291.INSTANCE, 72)
            .registerPacket(CameraPacket.class, CameraSerializer_v291.INSTANCE, 73)
            .registerPacket(BossEventPacket.class, BossEventSerializer_v291.INSTANCE, 74)
            .registerPacket(ShowCreditsPacket.class, ShowCreditsSerializer_v291.INSTANCE, 75)
            .registerPacket(AvailableCommandsPacket.class, AvailableCommandsSerializer_v291.INSTANCE, 76)
            .registerPacket(CommandRequestPacket.class, CommandRequestSerializer_v291.INSTANCE, 77)
            .registerPacket(CommandBlockUpdatePacket.class, CommandBlockUpdateSerializer_v291.INSTANCE, 78)
            .registerPacket(CommandOutputPacket.class, CommandOutputSerializer_v291.INSTANCE, 79)
            .registerPacket(UpdateTradePacket.class, UpdateTradeSerializer_v313.INSTANCE, 80)
            .registerPacket(UpdateEquipPacket.class, UpdateEquipSerializer_v291.INSTANCE, 81)
            .registerPacket(ResourcePackDataInfoPacket.class, ResourcePackDataInfoSerializer_v291.INSTANCE, 82)
            .registerPacket(ResourcePackChunkDataPacket.class, ResourcePackChunkDataSerializer_v291.INSTANCE, 83)
            .registerPacket(ResourcePackChunkRequestPacket.class, ResourcePackChunkRequestSerializer_v291.INSTANCE, 84)
            .registerPacket(TransferPacket.class, TransferSerializer_v291.INSTANCE, 85)
            .registerPacket(PlaySoundPacket.class, PlaySoundSerializer_v291.INSTANCE, 86)
            .registerPacket(StopSoundPacket.class, StopSoundSerializer_v291.INSTANCE, 87)
            .registerPacket(SetTitlePacket.class, SetTitleSerializer_v291.INSTANCE, 88)
            .registerPacket(AddBehaviorTreePacket.class, AddBehaviorTreeSerializer_v291.INSTANCE, 89)
            .registerPacket(StructureBlockUpdatePacket.class, StructureBlockUpdateSerializer_v291.INSTANCE, 90)
            .registerPacket(ShowStoreOfferPacket.class, ShowStoreOfferSerializer_v291.INSTANCE, 91)
            .registerPacket(PurchaseReceiptPacket.class, PurchaseReceiptSerializer_v291.INSTANCE, 92)
            .registerPacket(PlayerSkinPacket.class, PlayerSkinSerializer_v291.INSTANCE, 93)
            .registerPacket(SubClientLoginPacket.class, SubClientLoginSerializer_v291.INSTANCE, 94)
            .registerPacket(AutomationClientConnectPacket.class, AutomationClientConnectSerializer_v291.INSTANCE, 95)
            .registerPacket(SetLastHurtByPacket.class, SetLastHurtBySerializer_v291.INSTANCE, 96)
            .registerPacket(BookEditPacket.class, BookEditSerializer_v291.INSTANCE, 97)
            .registerPacket(NpcRequestPacket.class, NpcRequestSerializer_v291.INSTANCE, 98)
            .registerPacket(PhotoTransferPacket.class, PhotoTransferSerializer_v291.INSTANCE, 99)
            .registerPacket(ModalFormRequestPacket.class, ModalFormRequestSerializer_v291.INSTANCE, 100)
            .registerPacket(ModalFormResponsePacket.class, ModalFormResponseSerializer_v291.INSTANCE, 101)
            .registerPacket(ServerSettingsRequestPacket.class, ServerSettingsRequestSerializer_v291.INSTANCE, 102)
            .registerPacket(ServerSettingsResponsePacket.class, ServerSettingsResponseSerializer_v291.INSTANCE, 103)
            .registerPacket(ShowProfilePacket.class, ShowProfileSerializer_v291.INSTANCE, 104)
            .registerPacket(SetDefaultGameTypePacket.class, SetDefaultGameTypeSerializer_v291.INSTANCE, 105)
            .registerPacket(RemoveObjectivePacket.class, RemoveObjectiveSerializer_v291.INSTANCE, 106)
            .registerPacket(SetDisplayObjectivePacket.class, SetDisplayObjectiveSerializer_v291.INSTANCE, 107)
            .registerPacket(SetScorePacket.class, SetScoreSerializer_v291.INSTANCE, 108)
            .registerPacket(LabTablePacket.class, LabTableSerializer_v291.INSTANCE, 109)
            .registerPacket(UpdateBlockSyncedPacket.class, UpdateBlockSyncedSerializer_v291.INSTANCE, 110)
            .registerPacket(MoveEntityDeltaPacket.class, MoveEntityDeltaSerializer_v291.INSTANCE, 111)
            .registerPacket(SetScoreboardIdentityPacket.class, SetScoreboardIdentitySerializer_v291.INSTANCE, 112)
            .registerPacket(SetLocalPlayerAsInitializedPacket.class, SetLocalPlayerAsInitializedSerializer_v291.INSTANCE, 113)
            .registerPacket(UpdateSoftEnumPacket.class, UpdateSoftEnumSerializer_v291.INSTANCE, 114)
            .registerPacket(NetworkStackLatencyPacket.class, NetworkStackLatencySerializer_v332.INSTANCE, 115)
            .registerPacket(ScriptCustomEventPacket.class, ScriptCustomEventSerializer_v291.INSTANCE, 117)
            .registerPacket(SpawnParticleEffectPacket.class, SpawnParticleEffectSerializer_v332.INSTANCE, 118)
            .registerPacket(AvailableEntityIdentifiersPacket.class, AvailableEntityIdentifiersSerializer_v313.INSTANCE, 119)
            .registerPacket(LevelSoundEvent2Packet.class, LevelSoundEvent2Serializer_v313.INSTANCE, 120)
            .registerPacket(NetworkChunkPublisherUpdatePacket.class, NetworkChunkPublisherUpdateSerializer_v313.INSTANCE, 121)
            .registerPacket(BiomeDefinitionListPacket.class, BiomeDefinitionListSerializer_v313.INSTANCE, 122)
            .registerPacket(LevelSoundEventPacket.class, LevelSoundEventSerializer_v332.INSTANCE, 123)
            .registerPacket(Packet200.class, Packet200Serializer_v291.INSTANCE, 200)
            .registerPacket(Packet201.class, Packet201Serializer_v291.INSTANCE, 201)
            .registerPacket(Packet202.class, Packet202Serializer_v291.INSTANCE, 202)
            .registerPacket(Packet203.class, Packet203Serializer_v291.INSTANCE, 203)
            .registerPacket(Packet204.class, Packet204Serializer_v291.INSTANCE, 204)
            .registerPacket(Packet228.class, Packet228Serializer_v291.INSTANCE, 228)
            .build();
}
