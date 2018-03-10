package T145.boom.entities;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.item.EntityFallingBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;
import net.minecraftforge.common.IPlantable;

public class EntityShrapnel extends EntityFallingBlock {

	public EntityShrapnel(World world) {
		super(world);
	}

	public EntityShrapnel(World world, Explosion explosion, IBlockState shrapnelState) {
		super(world, explosion.x, explosion.y, explosion.z, shrapnelState);
	}

	@Override
	public void onUpdate() {
		BlockPos down = getPosition().down();
		IBlockState state = world.getBlockState(down);

		if (state.getBlock() instanceof IPlantable || state.getMaterial() == Material.LEAVES) {
			world.setBlockToAir(down);
		}

		super.onUpdate();
	}
}