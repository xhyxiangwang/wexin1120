package com.tencent.mm.plugin.appbrand.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.on;
import com.tencent.mm.k.g;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.appbrand.app.f;
import com.tencent.mm.plugin.appbrand.ui.AppBrandGuideUI.a;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;

public enum a
{
  public static final c<on> iDV;
  
  static
  {
    GMTrace.i(10026869587968L, 74706);
    iDW = new a[0];
    iDV = new c() {};
    GMTrace.o(10026869587968L, 74706);
  }
  
  public static boolean SX()
  {
    GMTrace.i(10025661628416L, 74697);
    if (!h.xx().wM())
    {
      GMTrace.o(10025661628416L, 74697);
      return false;
    }
    if (g.uz().getInt("WeAppForbiddenSwitch", 0) == 1)
    {
      w.i("MicroMsg.AppBrandEntranceLogic", "showInFindMore, WeAppForbiddenSwitch == 1, not show");
      GMTrace.o(10025661628416L, 74697);
      return false;
    }
    if ((Td()) || (d.Tp()))
    {
      GMTrace.o(10025661628416L, 74697);
      return true;
    }
    GMTrace.o(10025661628416L, 74697);
    return false;
  }
  
  public static void SY()
  {
    GMTrace.i(10025795846144L, 74698);
    if (!h.xx().wM())
    {
      GMTrace.o(10025795846144L, 74698);
      return;
    }
    if (SZ())
    {
      d.e locale = d.e.iEG;
      d.e.a("", 0L, 2, 1);
    }
    h.xz().xi().a(w.a.uZa, Boolean.valueOf(false));
    GMTrace.o(10025795846144L, 74698);
  }
  
  static boolean SZ()
  {
    GMTrace.i(10025930063872L, 74699);
    if (!h.xx().wM())
    {
      GMTrace.o(10025930063872L, 74699);
      return false;
    }
    boolean bool = ((Boolean)h.xz().xi().get(w.a.uZa, Boolean.valueOf(false))).booleanValue();
    GMTrace.o(10025930063872L, 74699);
    return bool;
  }
  
  static void Ta()
  {
    GMTrace.i(10026332717056L, 74702);
    bX(true);
    GMTrace.o(10026332717056L, 74702);
  }
  
  public static boolean Tb()
  {
    GMTrace.i(10026466934784L, 74703);
    if (!h.xx().wM())
    {
      GMTrace.o(10026466934784L, 74703);
      return false;
    }
    boolean bool = ((Boolean)h.xz().xi().get(w.a.uYP, Boolean.valueOf(false))).booleanValue();
    GMTrace.o(10026466934784L, 74703);
    return bool;
  }
  
  public static boolean Tc()
  {
    GMTrace.i(10026601152512L, 74704);
    if (!h.xx().wM())
    {
      GMTrace.o(10026601152512L, 74704);
      return false;
    }
    boolean bool = ((Boolean)h.xz().xi().get(w.a.uYO, Boolean.valueOf(false))).booleanValue();
    GMTrace.o(10026601152512L, 74704);
    return bool;
  }
  
  public static boolean Td()
  {
    GMTrace.i(10026735370240L, 74705);
    if ((Tc()) || (Tb()))
    {
      GMTrace.o(10026735370240L, 74705);
      return true;
    }
    GMTrace.o(10026735370240L, 74705);
    return false;
  }
  
  private static void bX(boolean paramBoolean)
  {
    GMTrace.i(10026198499328L, 74701);
    if (!h.xx().wM())
    {
      GMTrace.o(10026198499328L, 74701);
      return;
    }
    Object localObject = (Boolean)h.xz().xi().get(w.a.uYP, null);
    if ((localObject != null) && (!((Boolean)localObject).booleanValue()) && (paramBoolean))
    {
      h.xz().xi().a(w.a.uZa, Boolean.valueOf(true));
      localObject = d.e.iEG;
      d.e.a("", 0L, 1, 1);
    }
    for (int i = 1;; i = 0)
    {
      h.xz().xi().a(w.a.uYP, Boolean.valueOf(paramBoolean));
      if (i != 0)
      {
        localObject = f.RY();
        if (localObject != null) {
          ((AppBrandGuideUI.a)localObject).jqq = true;
        }
      }
      GMTrace.o(10026198499328L, 74701);
      return;
    }
  }
  
  static void hQ(int paramInt)
  {
    boolean bool2 = true;
    GMTrace.i(10026064281600L, 74700);
    if (!h.xx().wM())
    {
      GMTrace.o(10026064281600L, 74700);
      return;
    }
    t localt = h.xz().xi();
    w.a locala;
    if ((paramInt & 0x2) > 0)
    {
      bool1 = true;
      bX(bool1);
      locala = w.a.uYO;
      if ((paramInt & 0x1) <= 0) {
        break label84;
      }
    }
    label84:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      localt.a(locala, Boolean.valueOf(bool1));
      GMTrace.o(10026064281600L, 74700);
      return;
      bool1 = false;
      break;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */