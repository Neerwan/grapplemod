package com.yyon.grapplinghook;

import net.minecraftforge.common.config.Config;

@Config(modid="grapplemod", name="grapplingHook")
public class GrappleConfig {
	// rope
	public static double default_maxlen = 30;
	public static boolean default_phaserope = false;
	// hook thrower
	public static double default_hookgravity = 1F;
	public static double default_throwspeed = 2F;
	public static boolean default_reelin = true;
	public static double default_verticalthrowangle = 0F;
	public static double default_sneakingverticalthrowangle = 0F;
	// motor
	public static boolean default_motor = false;
	public static double default_motormaxspeed = 4;
	public static double default_motoracceleration = 0.2;
	public static boolean default_motorwhencrouching = true;
	public static boolean default_motorwhennotcrouching = true;
	public static boolean default_smartmotor = false;
	public static boolean default_motordampener = false;
	public static boolean default_pullbackwards = true;
	// swing speed
	public static double default_playermovementmult = 1;
	// ender staff
	public static boolean default_enderstaff = false;
	// forcefield
	public static boolean default_repel = false;
	public static double default_repelforce = 1;
	// hook magnet
	public static boolean default_attract = false;
	public static double default_attractradius = 3;
	// double hook
	public static boolean default_doublehook = false;
	public static boolean default_smartdoublemotor = true;
	public static double default_angle = 20;
	public static double default_sneakingangle = 10;
	public static boolean default_oneropepull = false;


	// rope
	public static double max_maxlen = 60;
	// hook thrower
	public static double max_hookgravity = 20;
	public static double max_throwspeed = 5;
	public static double max_verticalthrowangle = 45;
	public static double max_sneakingverticalthrowangle = 45;
	// motor
	public static double max_motormaxspeed = 4;
	public static double max_motoracceleration = 0.2;
	// swing speed
	public static double max_playermovementmult = 2;
	// forcefield
	public static double max_repelforce = 1;
	// hook magnet
	public static double max_attractradius = 3;
	// double hook
	public static double max_angle = 45;
	public static double max_sneakingangle = 45;
	
	
	// rope
	public static double max_upgrade_maxlen = 200;
	// hook thrower
	public static double max_upgrade_hookgravity = 20;
	public static double max_upgrade_throwspeed = 20;
	public static double max_upgrade_verticalthrowangle = 90;
	public static double max_upgrade_sneakingverticalthrowangle = 90;
	// motor
	public static double max_upgrade_motormaxspeed = 10;
	public static double max_upgrade_motoracceleration = 1;
	// swing speed
	public static double max_upgrade_playermovementmult = 5;
	// forcefield
	public static double max_upgrade_repelforce = 5;
	// hook magnet
	public static double max_upgrade_attractradius = 10;
	// double hook
	public static double max_upgrade_angle = 90;
	public static double max_upgrade_sneakingangle = 90;

	public static double min_hookgravity = 1;
	public static double min_upgrade_hookgravity = 0;
	
	public static String grapplingBlocks = "any";
	public static String grapplingNonBlocks = "none";
	
	// rope
	public static int enable_maxlen = 0;
	public static int enable_phaserope = 0;
	// hook thrower
	public static int enable_hookgravity = 0;
	public static int enable_throwspeed = 0;
	public static int enable_reelin = 0;
	public static int enable_verticalthrowangle = 0;
	public static int enable_sneakingverticalthrowangle = 0;
	// motor
	public static int enable_motor = 0;
	public static int enable_motormaxspeed = 0;
	public static int enable_motoracceleration = 0;
	public static int enable_motorwhencrouching = 0;
	public static int enable_motorwhennotcrouching = 0;
	public static int enable_smartmotor = 0;
	public static int enable_motordampener = 1;
	public static int enable_pullbackwards = 0;
	// swing speed
	public static int enable_playermovementmult = 0;
	// ender staff
	public static int enable_enderstaff = 0;
	// forcefield
	public static int enable_repel = 0;
	public static int enable_repelforce = 0;
	// hook magnet
	public static int enable_attract = 0;
	public static int enable_attractradius = 0;
	// double hook
	public static int enable_doublehook = 0;
	public static int enable_smartdoublemotor = 0;
	public static int enable_angle = 0;
	public static int enable_sneakingangle = 0;
	public static int enable_oneropepull = 0;
	
	public static boolean longfallbootsrecipe = true;
}
