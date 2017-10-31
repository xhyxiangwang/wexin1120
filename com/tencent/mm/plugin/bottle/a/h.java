package com.tencent.mm.plugin.bottle.a;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.k;
import com.tencent.mm.ac.n;
import com.tencent.mm.plugin.bottle.a;
import com.tencent.mm.protocal.c.ase;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.ap;
import java.util.Map;
import junit.framework.Assert;

public final class h
{
  public static abstract interface a
  {
    public abstract void bJ(int paramInt1, int paramInt2);
  }
  
  public static final class b
    implements com.tencent.mm.ac.e
  {
    public String iconUrl;
    public int keM;
    public String keR;
    private h.a keW;
    public String keX;
    public final f keY;
    
    public b()
    {
      GMTrace.i(7596320751616L, 56597);
      this.keW = null;
      this.keM = 55535;
      this.keX = "";
      this.iconUrl = "";
      this.keY = new f();
      GMTrace.o(7596320751616L, 56597);
    }
    
    public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
    {
      GMTrace.i(7596589187072L, 56599);
      w.d("MicroMsg.PickBottle", "type:" + paramk.getType() + " errType:" + paramInt1 + " errCode:" + paramInt2);
      if (paramk.getType() == 155)
      {
        paramk = (f)paramk;
        if (!paramk.keU)
        {
          if (this.keW != null) {
            this.keW.bJ(paramInt1, paramInt2);
          }
          this.keW = null;
          ap.wT().b(155, this);
          ap.wT().b(156, this);
          GMTrace.o(7596589187072L, 56599);
          return;
        }
        ap.wT().b(155, this);
        a.ifN.pt();
        if (paramk.agU().umm == null)
        {
          paramString = "";
          this.keR = paramString;
          this.keM = paramk.agU().mDF;
          if (paramk.agU().tWf != null) {
            break label299;
          }
          paramString = "";
          label192:
          paramString = bh.p(paramString, "branduser");
          if (paramString == null) {
            break label325;
          }
          this.keX = ((String)paramString.get(".branduser.$username"));
          this.iconUrl = ((String)paramString.get(".branduser.$iconurl"));
          if (this.keX == null) {
            break label325;
          }
          this.keM = 19990;
          if (this.keW != null)
          {
            if ((paramInt1 == 0) && (paramInt2 == 0)) {
              break label311;
            }
            this.keW.bJ(paramInt1, paramInt2);
          }
        }
        for (;;)
        {
          this.keW = null;
          GMTrace.o(7596589187072L, 56599);
          return;
          paramString = paramk.agU().umm;
          break;
          label299:
          paramString = paramk.agU().tWf;
          break label192;
          label311:
          this.keW.bJ(paramInt1, paramInt2);
        }
        label325:
        paramString = new e(this.keR, this.keM);
        ap.wT().a(paramString, 0);
        GMTrace.o(7596589187072L, 56599);
        return;
      }
      if (paramk.getType() == 156)
      {
        ap.wT().b(156, this);
        if (this.keW != null)
        {
          if ((paramInt1 == 0) && (paramInt2 == 0)) {
            break label420;
          }
          this.keW.bJ(paramInt1, paramInt2);
        }
        for (;;)
        {
          this.keW = null;
          GMTrace.o(7596589187072L, 56599);
          return;
          label420:
          this.keW.bJ(paramInt1, paramInt2);
        }
      }
      GMTrace.o(7596589187072L, 56599);
    }
    
    public final boolean a(h.a parama)
    {
      GMTrace.i(7596454969344L, 56598);
      w.d("MicroMsg.PickBottle", "bottle pick:" + c.agQ() + " throw:" + c.agP());
      if (this.keW == null) {}
      for (boolean bool = true;; bool = false)
      {
        Assert.assertTrue("renew this class", bool);
        Assert.assertTrue("must call back onFin", true);
        if (c.agQ() > 0) {
          break;
        }
        parama.bJ(1, 16);
        GMTrace.o(7596454969344L, 56598);
        return false;
      }
      ap.wT().a(155, this);
      ap.wT().a(156, this);
      this.keW = parama;
      bool = ap.wT().a(this.keY, 0);
      GMTrace.o(7596454969344L, 56598);
      return bool;
    }
  }
  
  public static final class c
    implements com.tencent.mm.ac.e
  {
    private h.a keW;
    private int keZ;
    
    public c(String paramString, h.a parama)
    {
      GMTrace.i(7594710138880L, 56585);
      this.keW = null;
      this.keZ = 0;
      if (!bg.mZ(paramString))
      {
        bool = true;
        Assert.assertTrue("emtpy input text", bool);
        if (parama == null) {
          break label102;
        }
      }
      label102:
      for (boolean bool = true;; bool = false)
      {
        Assert.assertTrue("must call back onFin", bool);
        if (c.agP() <= 0) {
          break label107;
        }
        ap.wT().a(154, this);
        this.keW = parama;
        paramString = new g(paramString);
        ap.wT().a(paramString, 0);
        GMTrace.o(7594710138880L, 56585);
        return;
        bool = false;
        break;
      }
      label107:
      if (parama != null) {
        parama.bJ(1, 16);
      }
      GMTrace.o(7594710138880L, 56585);
    }
    
    public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
    {
      GMTrace.i(7594844356608L, 56586);
      if (paramk.getType() != 154)
      {
        GMTrace.o(7594844356608L, 56586);
        return;
      }
      if (this.keW != null)
      {
        this.keZ = ((g)paramk).agV();
        this.keW.bJ(paramInt1, paramInt2);
      }
      this.keW = null;
      ap.wT().b(154, this);
      GMTrace.o(7594844356608L, 56586);
    }
  }
  
  public static final class d
    extends com.tencent.mm.e.b.h
    implements com.tencent.mm.ac.e
  {
    public h.a keW;
    private int keZ;
    
    public d(Context paramContext, h.a parama)
    {
      super(false);
      GMTrace.i(7594307485696L, 56582);
      this.keW = null;
      this.keZ = 0;
      if (parama != null) {
        bool = true;
      }
      Assert.assertTrue("must call back onFin", bool);
      ap.wT().a(154, this);
      this.keW = parama;
      GMTrace.o(7594307485696L, 56582);
    }
    
    public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
    {
      GMTrace.i(7594575921152L, 56584);
      if (paramk.getType() != 154)
      {
        GMTrace.o(7594575921152L, 56584);
        return;
      }
      if (this.keW != null)
      {
        this.keZ = ((g)paramk).agV();
        this.keW.bJ(paramInt1, paramInt2);
      }
      this.keW = null;
      ap.wT().b(154, this);
      GMTrace.o(7594575921152L, 56584);
    }
    
    public final boolean qx()
    {
      GMTrace.i(7594441703424L, 56583);
      Object localObject = super.getFileName();
      boolean bool = super.qx();
      super.reset();
      if (!bool)
      {
        ap.wT().b(154, this);
        this.keW = null;
        GMTrace.o(7594441703424L, 56583);
        return false;
      }
      if (c.agP() > 0)
      {
        localObject = new g((String)localObject, this.frJ);
        ap.wT().a((k)localObject, 0);
        GMTrace.o(7594441703424L, 56583);
        return true;
      }
      ap.wT().b(154, this);
      if (this.keW != null) {
        this.keW.bJ(1, 16);
      }
      GMTrace.o(7594441703424L, 56583);
      return false;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/bottle/a/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */