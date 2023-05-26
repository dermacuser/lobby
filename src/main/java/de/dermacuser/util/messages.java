// 
// Decompiled by Procyon v0.5.36
// 

package de.dermacuser.util;

import de.dermacuser.Plugin;

public class messages
{
    public static String joineventtitle;
    public static String joineventsubtitle;
    public static String joineventdevsubtitle;
    public static String Prefix;
    public static String nopermission;
    public static String notpossible;
    public static String syntaxerror;
    
    static {
        messages.joineventtitle = Plugin.getPlugin().getConfig().getString("Messages.Jointitle");
        messages.joineventsubtitle = Plugin.getPlugin().getConfig().getString("Messages.JoinsubTitle");
        messages.joineventdevsubtitle = Plugin.getPlugin().getConfig().getString("Messages.DebugMode");
        messages.Prefix = Plugin.getPlugin().getConfig().getString("Messages.Prefix");
        messages.nopermission = Plugin.getPlugin().getConfig().getString("Messages.NoPermission");
        messages.notpossible = Plugin.getPlugin().getConfig().getString("Messages.NotPossible");
        messages.syntaxerror = Plugin.getPlugin().getConfig().getString("Messages.Syntaxerror");
    }
}
