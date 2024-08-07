package net.minestom.server.entity.metadata.monster.zombie;

import net.minestom.server.entity.Entity;
import net.minestom.server.entity.MetadataHolder;
import org.jetbrains.annotations.NotNull;

public class HuskMeta extends ZombieMeta {
    public static final byte OFFSET = ZombieMeta.MAX_OFFSET;
    public static final byte MAX_OFFSET = OFFSET + 0;

    public HuskMeta(@NotNull Entity entity, @NotNull MetadataHolder metadata) {
        super(entity, metadata);
    }

}
