package emu.grasscutter.game.props;

import it.unimi.dsi.fastutil.ints.*;
import java.util.*;
import java.util.stream.Stream;
import lombok.Getter;

@Getter
public enum ActionReason {
    None(0),
    QuestItem(1),
    QuestReward(2),
    Trifle(3),
    Shop(4),
    PlayerUpgradeReward(5),
    AddAvatar(6),
    GadgetEnvAnimal(7),
    MonsterEnvAnimal(8),
    Compound(9),
    Cook(10),
    Gather(11),
    MailAttachment(12),
    CityLevelupReturn(15),
    CityLevelupReward(17),
    AreaExploreReward(18),
    UnlockPointReward(19),
    DungeonFirstPass(20),
    DungeonPass(21),
    ChangeElemType(23),
    FetterOpen(25),
    DailyTaskScore(26),
    DailyTaskHost(27),
    RandTaskHost(28),
    Expedition(29),
    Gacha(30),
    Combine(31),
    RandTaskGuest(32),
    DailyTaskGuest(33),
    ForgeOutput(34),
    ForgeReturn(35),
    InitAvatar(36),
    MonsterDie(37),
    Gm(38),
    OpenChest(39),
    GadgetDie(40),
    MonsterChangeHp(41),
    SubfieldDrop(42),
    PushTipsReward(43),
    ActivityMonsterDrop(44),
    ActivityGather(45),
    ActivitySubfieldDrop(46),
    TowerScheduleReward(47),
    TowerFloorStarReward(48),
    TowerFirstPassReward(49),
    TowerDailyReward(50),
    HitClientTrivialEntity(51),
    OpenWorldBossChest(52),
    MaterialDeleteReturn(53),
    SignInReward(54),
    OpenBlossomChest(55),
    Recharge(56),
    BonusActivityReward(57),
    TowerCommemorativeReward(58),
    TowerSkipFloorReward(59),
    RechargeBonus(60),
    RechargeCard(61),
    RechargeCardDaily(62),
    RechargeCardReplace(63),
    RechargeCardReplaceFree(64),
    RechargePlayReplace(65),
    MpPlayTakeReward(66),
    ActivityWatcher(67),
    SalesmanDeliverItem(68),
    SalesmanReward(69),
    Rebate(70),
    McoinExchangeHcoin(71),
    DailyTaskExchangeLegendaryKey(72),
    UnlockPersonLine(73),
    FetterLevelReward(74),
    BuyResin(75),
    RechargePackage(76),
    DeliveryDailyReward(77),
    CityReputationLevel(78),
    CityReputationQuest(79),
    CityReputationRequest(80),
    CityReputationExplore(81),
    OffergingLevel(82),
    RoutineHost(83),
    RoutineGuest(84),
    TreasureMapSpotToken(89),
    TreasureMapBonusLevelReward(90),
    TreasureMapMpReward(91),
    Convert(92),
    OverflowTransform(93),
    ActivityAvatarSelectionReward(96),
    ActivityWatcherBatch(97),
    HitTreeDrop(98),
    GetHomeLevelupReward(99),
    HomeDefaultFurniture(100),
    ActivityCond(101),
    BattlePassNotify(102),
    PlayerUseItem(1001),
    DropItem(1002),
    WeaponUpgrade(1011),
    WeaponPromote(1012),
    WeaponAwaken(1013),
    RelicUpgrade(1014),
    Ability(1015),
    DungeonStatueDrop(1016),
    OfflineMsg(1017),
    AvatarUpgrade(1018),
    AvatarPromote(1019),
    QuestAction(1021),
    CityLevelup(1022),
    UpgradeSkill(1024),
    UnlockTalent(1025),
    UpgradeProudSkill(1026),
    PlayerLevelLimitUp(1027),
    DungeonDaily(1028),
    ItemGiving(1030),
    ForgeCost(1031),
    InvestigationReward(1032),
    InvestigationTargetReward(1033),
    GadgetInteract(1034),
    SeaLampCiMaterial(1036),
    SeaLampContributionReward(1037),
    SeaLampPhaseReward(1038),
    SeaLampFlyLamp(1039),
    AutoRecover(1040),
    ActivityExpireItem(1041),
    SubCoinNegative(1042),
    BargainDeduct(1043),
    BattlePassPaidReward(1044),
    BattlePassLevelReward(1045),
    TrialAvatarActivityFirstPassReward(1046),
    BuyBattlePassLevel(1047),
    GrantBirthdayBenefit(1048),
    AchievementReward(1049),
    AchievementGoalReward(1050),
    FirstShareToSocialNetwork(1051),
    DestroyMaterial(1052),
    CodexLevelupReward(1053),
    HuntingOfferReward(1054),
    UseWidgetAnchorPoint(1055),
    UseWidgetBonfire(1056),
    UngradeWeaponReturnMaterial(1057),
    UseWidgetOneoffGatherPointDetector(1058),
    UseWidgetClientCollector(1059),
    UseWidgetClientDetector(1060),
    TakeGeneralReward(1061),
    AsterTakeSpecialReward(1062),
    RemoveCodexBook(1063),
    OfferingItem(1064),
    UseWidgetGadgetBuilder(1065),
    EffigyFirstPassReward(1066),
    EffigyReward(1067),
    ReunionFirstGiftReward(1068),
    ReunionSignInReward(1069),
    ReunionWatcherReward(1070),
    SalesmanMpReward(1071),
    ActionReasionAvatarPromoteReward(1072),
    BlessingRedeemReward(1073),
    ActionMiracleRingReward(1074),
    ExpeditionReward(1075),
    TreasureMapRemoveDetector(1076),
    MechanicusDungeonTicket(1077),
    MechanicusLevelupGear(1078),
    MechanicusBattleSettle(1079),
    RegionSearchReward(1080),
    UnlockCoopChapter(1081),
    TakeCoopReward(1082),
    FleurFairDungeonReward(1083),
    ActivityScore(1084),
    ChannellerSlabOneoffDungeonReward(1085),
    FurnitureMakeStart(1086),
    FurnitureMakeTake(1087),
    FurnitureMakeCancel(1088),
    FurnitureMakeFastFinish(1089),
    ChannellerSlabLoopDungeonFirstPassReward(1090),
    ChannellerSlabLoopDungeonScoreReward(1091),
    HomeLimitedShopBuy(1092),
    HomeCoinCollect(1093),
    HomeAvatarEventReward(1100);

    private static final Int2ObjectMap<ActionReason> map = new Int2ObjectOpenHashMap<>();
    private static final Map<String, ActionReason> stringMap = new HashMap<>();

    static {
        Stream.of(values())
                .forEach(
                        e -> {
                            map.put(e.getValue(), e);
                            stringMap.put(e.name(), e);
                        });
    }

    private final int value;

    ActionReason(int value) {
        this.value = value;
    }

    public static ActionReason getTypeByValue(int value) {
        return map.getOrDefault(value, None);
    }

    public static ActionReason getTypeByName(String name) {
        return stringMap.getOrDefault(name, None);
    }
}
