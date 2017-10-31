package com.tencent.mm.plugin.webview.ui.tools.game.menu;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.amu;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.base.m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class c
{
  private static c sxy;
  
  public c()
  {
    GMTrace.i(18085570412544L, 134748);
    GMTrace.o(18085570412544L, 134748);
  }
  
  public static c bCU()
  {
    GMTrace.i(18085704630272L, 134749);
    if (sxy == null) {}
    try
    {
      if (sxy == null) {
        sxy = new c();
      }
      c localc = sxy;
      GMTrace.o(18085704630272L, 134749);
      return localc;
    }
    finally {}
  }
  
  public final m f(List<amu> paramList, boolean paramBoolean)
  {
    GMTrace.i(18085838848000L, 134750);
    if (bg.bX(paramList))
    {
      GMTrace.o(18085838848000L, 134750);
      return null;
    }
    Object localObject = new ArrayList();
    paramList = paramList.iterator();
    amu localamu;
    while (paramList.hasNext())
    {
      localamu = (amu)paramList.next();
      if ((localamu != null) && (a.xJ(localamu.tSa))) {
        ((List)localObject).add(localamu);
      }
    }
    if (bg.bX((List)localObject))
    {
      GMTrace.o(18085838848000L, 134750);
      return null;
    }
    Collections.sort((List)localObject, new Comparator() {});
    int j = ((amu)((List)localObject).get(((List)localObject).size() - 1)).uiN;
    paramList = new ArrayList();
    int i = 0;
    while (i < j)
    {
      paramList.add(null);
      i += 1;
    }
    localObject = ((List)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      localamu = (amu)((Iterator)localObject).next();
      if (a.xK(localamu.tSa) == a.sxF)
      {
        if ((!paramBoolean) && (localamu.uiN > 0) && (localamu.uiN <= paramList.size())) {
          paramList.set(localamu.uiN - 1, localamu);
        }
      }
      else if (a.xK(localamu.tSa) == a.sxG)
      {
        if ((paramBoolean) && (localamu.uiN > 0) && (localamu.uiN <= paramList.size())) {
          paramList.set(localamu.uiN - 1, localamu);
        }
      }
      else if ((localamu.uiN > 0) && (localamu.uiN <= paramList.size())) {
        paramList.set(localamu.uiN - 1, localamu);
      }
    }
    localObject = new m();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      localamu = (amu)paramList.next();
      if (localamu == null)
      {
        ((m)localObject).e(-1, "");
      }
      else
      {
        String str = localamu.fuw + "__" + localamu.osy;
        ((m)localObject).e(localamu.uiM, str);
      }
    }
    GMTrace.o(18085838848000L, 134750);
    return (m)localObject;
  }
  
  public static enum a
  {
    private static EnumMap<a, Integer> sxL;
    int code;
    
    static
    {
      GMTrace.i(18083020275712L, 134729);
      sxA = new a("HVGAME_MENU_ACTION_DEFAULT", 0, 0);
      sxB = new a("HVGAME_MENU_ACTION_JUMP_H5", 1, 1);
      sxC = new a("HVGAME_MENU_ACTION_EXIT", 2, 2);
      sxD = new a("HVGAME_MENU_ACTION_SHARE_TO_FRIEND", 3, 3);
      sxE = new a("HVGAME_MENU_ACTION_COLLECT", 4, 4);
      sxF = new a("HVGAME_MENU_ACTION_STICK_ON", 5, 5);
      sxG = new a("HVGAME_MENU_ACTION_STICK_OFF", 6, 6);
      sxH = new a("HVGAME_MENU_ACTION_REFRESH", 7, 7);
      sxI = new a("HVGAME_MENU_ACTION_ADD_TO_DESKTOP", 8, 8);
      sxJ = new a("HVGAME_MENU_ACTION_COMPLAINT", 9, 9);
      sxK = new a("HVGAME_MENU_ACTION_CUSTOM", 10, 10);
      sxM = new a[] { sxA, sxB, sxC, sxD, sxE, sxF, sxG, sxH, sxI, sxJ, sxK };
      sxL = new EnumMap(a.class);
      Iterator localIterator = EnumSet.allOf(a.class).iterator();
      while (localIterator.hasNext())
      {
        a locala = (a)localIterator.next();
        sxL.put(locala, Integer.valueOf(locala.code));
      }
      GMTrace.o(18083020275712L, 134729);
    }
    
    private a(int paramInt)
    {
      GMTrace.i(18082617622528L, 134726);
      this.code = paramInt;
      GMTrace.o(18082617622528L, 134726);
    }
    
    public static boolean xJ(int paramInt)
    {
      GMTrace.i(18082751840256L, 134727);
      boolean bool = sxL.containsValue(Integer.valueOf(paramInt));
      GMTrace.o(18082751840256L, 134727);
      return bool;
    }
    
    public static a xK(int paramInt)
    {
      GMTrace.i(18082886057984L, 134728);
      Object localObject = sxL.entrySet().iterator();
      while (((Iterator)localObject).hasNext())
      {
        Map.Entry localEntry = (Map.Entry)((Iterator)localObject).next();
        if (((Integer)localEntry.getValue()).intValue() == paramInt)
        {
          localObject = (a)localEntry.getKey();
          GMTrace.o(18082886057984L, 134728);
          return (a)localObject;
        }
      }
      localObject = sxA;
      GMTrace.o(18082886057984L, 134728);
      return (a)localObject;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/webview/ui/tools/game/menu/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */