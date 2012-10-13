/*
    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package me.mango.toughmobs;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityCombustEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class ToughMobs extends JavaPlugin implements Listener {
	
	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(this, this);
		getLogger().info(getDescription().getName() + " " + getDescription().getVersion() + " by Mango enabled.");
	}
	
	@Override
	public void onDisable() {
		getLogger().info(getDescription().getName() + " " + getDescription().getVersion() + " by Mango enabled.");
	}

	@EventHandler(ignoreCancelled = true)
	public void onEntityCombust(EntityCombustEvent event) {
		event.setCancelled(true);
	}
}
