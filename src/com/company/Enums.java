package com.company;

  enum EatCase {
    EDIBLE,
    CONTAMINATED,
    INEDIBLE,
    NOTFOUND
  }

  enum HpCase {
    Unhurt,
    Bruised,
    Wounded,
    Injured,
    Crippled,
    Bleeding,
    Critical
  }

  enum CombatOption {
    Acute,
    Brutal,
    Cautious,
    Counter,
    Block,
    Evade,
    Flee
  }

  enum CombatResult {
    Tie,
    Succes,
    BrutalSucces,
    Loss,
    BrutalLoss,
    EvadeSucces,
    BlockSucces,
    EnemyBlockSucces,
    FleeSucces
  }

  enum AttackCase {
    EnemyPresent,
    MeleeSwingMiss,
    RangedWeaponMiss,
    ThrownWeaponMiss,
    NoAmmo,
    Empty
  }

  enum EquipCase {
    NOTFOUND,
    EQUIPPED,
    NOTEQUIPPED
  }

  enum ContainerCase{
    OPENED,
    LOCKED,
    NOTCONTAINER,
    NOTFOUND
  }

