package com.tencent.pb.common.b.a;

import com.google.a.a.b;
import com.google.a.a.c;
import com.google.a.a.e;
import com.google.a.a.g;
import java.util.Arrays;

public abstract interface a
{
  public static final class a
    extends e
  {
    public String groupId = "";
    public int rph = 0;
    public long rpi = 0L;
    public int[] xnK = g.aCZ;
    public int xnL = 0;
    public String[] xnM = g.EMPTY_STRING_ARRAY;
    
    public a()
    {
      this.aCY = -1;
    }
    
    public final void a(b paramb)
    {
      int j = 0;
      if (!this.groupId.equals("")) {
        paramb.e(1, this.groupId);
      }
      if (this.rph != 0) {
        paramb.ao(2, this.rph);
      }
      if (this.rpi != 0L) {
        paramb.g(3, this.rpi);
      }
      int i;
      if ((this.xnK != null) && (this.xnK.length > 0))
      {
        i = 0;
        while (i < this.xnK.length)
        {
          paramb.ap(4, this.xnK[i]);
          i += 1;
        }
      }
      if (this.xnL != 0) {
        paramb.ao(5, this.xnL);
      }
      if ((this.xnM != null) && (this.xnM.length > 0))
      {
        i = j;
        while (i < this.xnM.length)
        {
          String str = this.xnM[i];
          if (str != null) {
            paramb.e(100, str);
          }
          i += 1;
        }
      }
      super.a(paramb);
    }
    
    protected final int nz()
    {
      int n = 0;
      int j = super.nz();
      int i = j;
      if (!this.groupId.equals("")) {
        i = j + b.f(1, this.groupId);
      }
      j = i;
      if (this.rph != 0) {
        j = i + b.aq(2, this.rph);
      }
      i = j;
      if (this.rpi != 0L) {
        i = j + b.i(3, this.rpi);
      }
      j = i;
      int k;
      if (this.xnK != null)
      {
        j = i;
        if (this.xnK.length > 0)
        {
          j = 0;
          k = 0;
          while (j < this.xnK.length)
          {
            k += b.cM(this.xnK[j]);
            j += 1;
          }
          j = i + k + this.xnK.length * 1;
        }
      }
      i = j;
      if (this.xnL != 0) {
        i = j + b.aq(5, this.xnL);
      }
      j = i;
      if (this.xnM != null)
      {
        j = i;
        if (this.xnM.length > 0)
        {
          k = 0;
          int m = 0;
          j = n;
          while (j < this.xnM.length)
          {
            String str = this.xnM[j];
            int i1 = k;
            n = m;
            if (str != null)
            {
              n = m + 1;
              i1 = k + b.aF(str);
            }
            j += 1;
            k = i1;
            m = n;
          }
          j = i + k + m * 2;
        }
      }
      return j;
    }
  }
  
  public static final class aa
    extends e
  {
    public String groupId = "";
    public a.aq xnP = null;
    public int xpo = 0;
    
    public aa()
    {
      this.aCY = -1;
    }
    
    public final void a(b paramb)
    {
      if (!this.groupId.equals("")) {
        paramb.e(1, this.groupId);
      }
      if (this.xnP != null) {
        paramb.a(2, this.xnP);
      }
      if (this.xpo != 0) {
        paramb.ao(3, this.xpo);
      }
      super.a(paramb);
    }
    
    protected final int nz()
    {
      int j = super.nz();
      int i = j;
      if (!this.groupId.equals("")) {
        i = j + b.f(1, this.groupId);
      }
      j = i;
      if (this.xnP != null) {
        j = i + b.b(2, this.xnP);
      }
      i = j;
      if (this.xpo != 0) {
        i = j + b.aq(3, this.xpo);
      }
      return i;
    }
  }
  
  public static final class ab
    extends e
  {
    public String groupId = "";
    public int rph = 0;
    public long rpi = 0L;
    public String xnN = "";
    
    public ab()
    {
      this.aCY = -1;
    }
    
    public final void a(b paramb)
    {
      if (!this.groupId.equals("")) {
        paramb.e(1, this.groupId);
      }
      if (this.rph != 0) {
        paramb.ao(2, this.rph);
      }
      if (this.rpi != 0L) {
        paramb.g(3, this.rpi);
      }
      if (!this.xnN.equals("")) {
        paramb.e(4, this.xnN);
      }
      super.a(paramb);
    }
    
    protected final int nz()
    {
      int j = super.nz();
      int i = j;
      if (!this.groupId.equals("")) {
        i = j + b.f(1, this.groupId);
      }
      j = i;
      if (this.rph != 0) {
        j = i + b.aq(2, this.rph);
      }
      i = j;
      if (this.rpi != 0L) {
        i = j + b.i(3, this.rpi);
      }
      j = i;
      if (!this.xnN.equals("")) {
        j = i + b.f(4, this.xnN);
      }
      return j;
    }
  }
  
  public static final class ac
    extends e
  {
    public int xpp = 0;
    
    public ac()
    {
      this.aCY = -1;
    }
    
    public final void a(b paramb)
    {
      if (this.xpp != 0) {
        paramb.ap(1, this.xpp);
      }
      super.a(paramb);
    }
    
    protected final int nz()
    {
      int j = super.nz();
      int i = j;
      if (this.xpp != 0) {
        i = j + b.ar(1, this.xpp);
      }
      return i;
    }
  }
  
  public static final class ad
    extends e
  {
    public String groupId = "";
    public int rph = 0;
    public long rpi = 0L;
    public a.aq xnP = null;
    public a.ap xou = null;
    public a.as[] xoy = a.as.cjL();
    public a.as[] xpe = a.as.cjL();
    public a.n[] xpf = a.n.cjF();
    public a.at[] xpg = a.at.cjM();
    public int xph = 0;
    public int[] xpi = g.aCZ;
    
    public ad()
    {
      this.aCY = -1;
    }
    
    public final void a(b paramb)
    {
      int j = 0;
      if (!this.groupId.equals("")) {
        paramb.e(1, this.groupId);
      }
      if (this.rph != 0) {
        paramb.ao(2, this.rph);
      }
      if (this.rpi != 0L) {
        paramb.g(3, this.rpi);
      }
      int i;
      Object localObject;
      if ((this.xpf != null) && (this.xpf.length > 0))
      {
        i = 0;
        while (i < this.xpf.length)
        {
          localObject = this.xpf[i];
          if (localObject != null) {
            paramb.a(4, (e)localObject);
          }
          i += 1;
        }
      }
      if (this.xou != null) {
        paramb.a(5, this.xou);
      }
      if (this.xph != 0) {
        paramb.ao(6, this.xph);
      }
      if ((this.xpi != null) && (this.xpi.length > 0))
      {
        i = 0;
        while (i < this.xpi.length)
        {
          paramb.ao(7, this.xpi[i]);
          i += 1;
        }
      }
      if ((this.xpe != null) && (this.xpe.length > 0))
      {
        i = 0;
        while (i < this.xpe.length)
        {
          localObject = this.xpe[i];
          if (localObject != null) {
            paramb.a(200, (e)localObject);
          }
          i += 1;
        }
      }
      if ((this.xpg != null) && (this.xpg.length > 0))
      {
        i = 0;
        while (i < this.xpg.length)
        {
          localObject = this.xpg[i];
          if (localObject != null) {
            paramb.a(201, (e)localObject);
          }
          i += 1;
        }
      }
      if (this.xnP != null) {
        paramb.a(202, this.xnP);
      }
      if ((this.xoy != null) && (this.xoy.length > 0))
      {
        i = j;
        while (i < this.xoy.length)
        {
          localObject = this.xoy[i];
          if (localObject != null) {
            paramb.a(203, (e)localObject);
          }
          i += 1;
        }
      }
      super.a(paramb);
    }
    
    protected final int nz()
    {
      int m = 0;
      int j = super.nz();
      int i = j;
      if (!this.groupId.equals("")) {
        i = j + b.f(1, this.groupId);
      }
      j = i;
      if (this.rph != 0) {
        j = i + b.aq(2, this.rph);
      }
      i = j;
      if (this.rpi != 0L) {
        i = j + b.i(3, this.rpi);
      }
      j = i;
      Object localObject;
      if (this.xpf != null)
      {
        j = i;
        if (this.xpf.length > 0)
        {
          j = 0;
          while (j < this.xpf.length)
          {
            localObject = this.xpf[j];
            k = i;
            if (localObject != null) {
              k = i + b.b(4, (e)localObject);
            }
            j += 1;
            i = k;
          }
          j = i;
        }
      }
      i = j;
      if (this.xou != null) {
        i = j + b.b(5, this.xou);
      }
      j = i;
      if (this.xph != 0) {
        j = i + b.aq(6, this.xph);
      }
      i = j;
      if (this.xpi != null)
      {
        i = j;
        if (this.xpi.length > 0)
        {
          i = 0;
          k = 0;
          while (i < this.xpi.length)
          {
            k += b.cI(this.xpi[i]);
            i += 1;
          }
          i = j + k + this.xpi.length * 1;
        }
      }
      j = i;
      if (this.xpe != null)
      {
        j = i;
        if (this.xpe.length > 0)
        {
          j = 0;
          while (j < this.xpe.length)
          {
            localObject = this.xpe[j];
            k = i;
            if (localObject != null) {
              k = i + b.b(200, (e)localObject);
            }
            j += 1;
            i = k;
          }
          j = i;
        }
      }
      int k = j;
      if (this.xpg != null)
      {
        k = j;
        if (this.xpg.length > 0)
        {
          i = j;
          j = 0;
          while (j < this.xpg.length)
          {
            localObject = this.xpg[j];
            k = i;
            if (localObject != null) {
              k = i + b.b(201, (e)localObject);
            }
            j += 1;
            i = k;
          }
          k = i;
        }
      }
      i = k;
      if (this.xnP != null) {
        i = k + b.b(202, this.xnP);
      }
      k = i;
      if (this.xoy != null)
      {
        k = i;
        if (this.xoy.length > 0)
        {
          j = m;
          for (;;)
          {
            k = i;
            if (j >= this.xoy.length) {
              break;
            }
            localObject = this.xoy[j];
            k = i;
            if (localObject != null) {
              k = i + b.b(203, (e)localObject);
            }
            j += 1;
            i = k;
          }
        }
      }
      return k;
    }
  }
  
  public static final class ae
    extends e
  {
    public a.ar[] xpq = a.ar.cjK();
    
    public ae()
    {
      this.aCY = -1;
    }
    
    public final void a(b paramb)
    {
      if ((this.xpq != null) && (this.xpq.length > 0))
      {
        int i = 0;
        while (i < this.xpq.length)
        {
          a.ar localar = this.xpq[i];
          if (localar != null) {
            paramb.a(1, localar);
          }
          i += 1;
        }
      }
      super.a(paramb);
    }
    
    protected final int nz()
    {
      int i = super.nz();
      int k = i;
      if (this.xpq != null)
      {
        k = i;
        if (this.xpq.length > 0)
        {
          int j = 0;
          for (;;)
          {
            k = i;
            if (j >= this.xpq.length) {
              break;
            }
            a.ar localar = this.xpq[j];
            k = i;
            if (localar != null) {
              k = i + b.b(1, localar);
            }
            j += 1;
            i = k;
          }
        }
      }
      return k;
    }
  }
  
  public static final class af
    extends e
  {
    public int ret = 0;
    
    public af()
    {
      this.aCY = -1;
    }
    
    public final void a(b paramb)
    {
      if (this.ret != 0) {
        paramb.ao(1, this.ret);
      }
      super.a(paramb);
    }
    
    protected final int nz()
    {
      int j = super.nz();
      int i = j;
      if (this.ret != 0) {
        i = j + b.aq(1, this.ret);
      }
      return i;
    }
  }
  
  public static final class ag
    extends e
  {
    public String groupId = "";
    public int rph = 0;
    public long rpi = 0L;
    public a.aq xnP = null;
    public a.ap xou = null;
    public a.as[] xoy = a.as.cjL();
    public a.as[] xpe = a.as.cjL();
    public a.n[] xpf = a.n.cjF();
    public a.at[] xpg = a.at.cjM();
    public int xph = 0;
    public int[] xpi = g.aCZ;
    public a.n[] xpj = a.n.cjF();
    public a.n[] xpm = a.n.cjF();
    public int xpn = 0;
    
    public ag()
    {
      this.aCY = -1;
    }
    
    public final void a(b paramb)
    {
      int j = 0;
      if (!this.groupId.equals("")) {
        paramb.e(1, this.groupId);
      }
      if (this.rph != 0) {
        paramb.ao(2, this.rph);
      }
      if (this.rpi != 0L) {
        paramb.g(3, this.rpi);
      }
      int i;
      Object localObject;
      if ((this.xpf != null) && (this.xpf.length > 0))
      {
        i = 0;
        while (i < this.xpf.length)
        {
          localObject = this.xpf[i];
          if (localObject != null) {
            paramb.a(4, (e)localObject);
          }
          i += 1;
        }
      }
      if ((this.xpe != null) && (this.xpe.length > 0))
      {
        i = 0;
        while (i < this.xpe.length)
        {
          localObject = this.xpe[i];
          if (localObject != null) {
            paramb.a(5, (e)localObject);
          }
          i += 1;
        }
      }
      if (this.xou != null) {
        paramb.a(6, this.xou);
      }
      if (this.xph != 0) {
        paramb.ao(7, this.xph);
      }
      if ((this.xpi != null) && (this.xpi.length > 0))
      {
        i = 0;
        while (i < this.xpi.length)
        {
          paramb.ao(8, this.xpi[i]);
          i += 1;
        }
      }
      if ((this.xpg != null) && (this.xpg.length > 0))
      {
        i = 0;
        while (i < this.xpg.length)
        {
          localObject = this.xpg[i];
          if (localObject != null) {
            paramb.a(9, (e)localObject);
          }
          i += 1;
        }
      }
      if (this.xnP != null) {
        paramb.a(10, this.xnP);
      }
      if ((this.xpj != null) && (this.xpj.length > 0))
      {
        i = 0;
        while (i < this.xpj.length)
        {
          localObject = this.xpj[i];
          if (localObject != null) {
            paramb.a(11, (e)localObject);
          }
          i += 1;
        }
      }
      if ((this.xoy != null) && (this.xoy.length > 0))
      {
        i = 0;
        while (i < this.xoy.length)
        {
          localObject = this.xoy[i];
          if (localObject != null) {
            paramb.a(12, (e)localObject);
          }
          i += 1;
        }
      }
      if ((this.xpm != null) && (this.xpm.length > 0))
      {
        i = j;
        while (i < this.xpm.length)
        {
          localObject = this.xpm[i];
          if (localObject != null) {
            paramb.a(13, (e)localObject);
          }
          i += 1;
        }
      }
      if (this.xpn != 0) {
        paramb.ao(14, this.xpn);
      }
      super.a(paramb);
    }
    
    protected final int nz()
    {
      int m = 0;
      int j = super.nz();
      int i = j;
      if (!this.groupId.equals("")) {
        i = j + b.f(1, this.groupId);
      }
      j = i;
      if (this.rph != 0) {
        j = i + b.aq(2, this.rph);
      }
      i = j;
      if (this.rpi != 0L) {
        i = j + b.i(3, this.rpi);
      }
      j = i;
      Object localObject;
      if (this.xpf != null)
      {
        j = i;
        if (this.xpf.length > 0)
        {
          j = 0;
          while (j < this.xpf.length)
          {
            localObject = this.xpf[j];
            k = i;
            if (localObject != null) {
              k = i + b.b(4, (e)localObject);
            }
            j += 1;
            i = k;
          }
          j = i;
        }
      }
      i = j;
      if (this.xpe != null)
      {
        i = j;
        if (this.xpe.length > 0)
        {
          i = j;
          j = 0;
          while (j < this.xpe.length)
          {
            localObject = this.xpe[j];
            k = i;
            if (localObject != null) {
              k = i + b.b(5, (e)localObject);
            }
            j += 1;
            i = k;
          }
        }
      }
      int k = i;
      if (this.xou != null) {
        k = i + b.b(6, this.xou);
      }
      j = k;
      if (this.xph != 0) {
        j = k + b.aq(7, this.xph);
      }
      i = j;
      if (this.xpi != null)
      {
        i = j;
        if (this.xpi.length > 0)
        {
          i = 0;
          k = 0;
          while (i < this.xpi.length)
          {
            k += b.cI(this.xpi[i]);
            i += 1;
          }
          i = j + k + this.xpi.length * 1;
        }
      }
      j = i;
      if (this.xpg != null)
      {
        j = i;
        if (this.xpg.length > 0)
        {
          j = 0;
          while (j < this.xpg.length)
          {
            localObject = this.xpg[j];
            k = i;
            if (localObject != null) {
              k = i + b.b(9, (e)localObject);
            }
            j += 1;
            i = k;
          }
          j = i;
        }
      }
      i = j;
      if (this.xnP != null) {
        i = j + b.b(10, this.xnP);
      }
      j = i;
      if (this.xpj != null)
      {
        j = i;
        if (this.xpj.length > 0)
        {
          j = 0;
          while (j < this.xpj.length)
          {
            localObject = this.xpj[j];
            k = i;
            if (localObject != null) {
              k = i + b.b(11, (e)localObject);
            }
            j += 1;
            i = k;
          }
          j = i;
        }
      }
      i = j;
      if (this.xoy != null)
      {
        i = j;
        if (this.xoy.length > 0)
        {
          i = j;
          j = 0;
          while (j < this.xoy.length)
          {
            localObject = this.xoy[j];
            k = i;
            if (localObject != null) {
              k = i + b.b(12, (e)localObject);
            }
            j += 1;
            i = k;
          }
        }
      }
      j = i;
      if (this.xpm != null)
      {
        j = i;
        if (this.xpm.length > 0)
        {
          k = m;
          for (;;)
          {
            j = i;
            if (k >= this.xpm.length) {
              break;
            }
            localObject = this.xpm[k];
            j = i;
            if (localObject != null) {
              j = i + b.b(13, (e)localObject);
            }
            k += 1;
            i = j;
          }
        }
      }
      i = j;
      if (this.xpn != 0) {
        i = j + b.aq(14, this.xpn);
      }
      return i;
    }
  }
  
  public static final class ah
    extends e
  {
    public String groupId = "";
    public int rph = 0;
    public long rpi = 0L;
    
    public ah()
    {
      this.aCY = -1;
    }
    
    public final void a(b paramb)
    {
      if (!this.groupId.equals("")) {
        paramb.e(1, this.groupId);
      }
      if (this.rph != 0) {
        paramb.ao(2, this.rph);
      }
      if (this.rpi != 0L) {
        paramb.g(3, this.rpi);
      }
      super.a(paramb);
    }
    
    protected final int nz()
    {
      int j = super.nz();
      int i = j;
      if (!this.groupId.equals("")) {
        i = j + b.f(1, this.groupId);
      }
      j = i;
      if (this.rph != 0) {
        j = i + b.aq(2, this.rph);
      }
      i = j;
      if (this.rpi != 0L) {
        i = j + b.i(3, this.rpi);
      }
      return i;
    }
  }
  
  public static final class ai
    extends e
  {
    public byte[] buffer = g.aDf;
    public int usf = 0;
    
    public ai()
    {
      this.aCY = -1;
    }
    
    public final void a(b paramb)
    {
      paramb.ap(1, this.usf);
      if (!Arrays.equals(this.buffer, g.aDf)) {
        paramb.a(2, this.buffer);
      }
      super.a(paramb);
    }
    
    protected final int nz()
    {
      int j = super.nz() + b.ar(1, this.usf);
      int i = j;
      if (!Arrays.equals(this.buffer, g.aDf)) {
        i = j + b.b(2, this.buffer);
      }
      return i;
    }
  }
  
  public static final class aj
    extends e
  {
    private static volatile aj[] xpr;
    public int mXM = 0;
    public int trb = 0;
    public String xps = "";
    public int xpt = 0;
    
    public aj()
    {
      this.aCY = -1;
    }
    
    public static aj[] cjH()
    {
      if (xpr == null) {}
      synchronized (c.aCX)
      {
        if (xpr == null) {
          xpr = new aj[0];
        }
        return xpr;
      }
    }
    
    public final void a(b paramb)
    {
      if (this.mXM != 0) {
        paramb.ap(1, this.mXM);
      }
      if (!this.xps.equals("")) {
        paramb.e(2, this.xps);
      }
      if (this.trb != 0) {
        paramb.ap(3, this.trb);
      }
      if (this.xpt != 0) {
        paramb.ap(4, this.xpt);
      }
      super.a(paramb);
    }
    
    protected final int nz()
    {
      int j = super.nz();
      int i = j;
      if (this.mXM != 0) {
        i = j + b.ar(1, this.mXM);
      }
      j = i;
      if (!this.xps.equals("")) {
        j = i + b.f(2, this.xps);
      }
      i = j;
      if (this.trb != 0) {
        i = j + b.ar(3, this.trb);
      }
      j = i;
      if (this.xpt != 0) {
        j = i + b.ar(4, this.xpt);
      }
      return j;
    }
  }
  
  public static final class ak
    extends e
  {
    public int hNG = 0;
    public long xpu = 0L;
    public int xpv = 0;
    
    public ak()
    {
      this.aCY = -1;
    }
    
    public final void a(b paramb)
    {
      if (this.xpu != 0L) {
        paramb.f(1, this.xpu);
      }
      if (this.hNG != 0) {
        paramb.ap(2, this.hNG);
      }
      if (this.xpv != 0) {
        paramb.ap(3, this.xpv);
      }
      super.a(paramb);
    }
    
    protected final int nz()
    {
      int j = super.nz();
      int i = j;
      if (this.xpu != 0L) {
        i = j + b.h(1, this.xpu);
      }
      j = i;
      if (this.hNG != 0) {
        j = i + b.ar(2, this.hNG);
      }
      i = j;
      if (this.xpv != 0) {
        i = j + b.ar(3, this.xpv);
      }
      return i;
    }
  }
  
  public static final class al
    extends e
  {
    private static volatile al[] xpw;
    public int gHD = 0;
    public int mXM = 0;
    public int xpp = 0;
    public int xpx = 0;
    
    public al()
    {
      this.aCY = -1;
    }
    
    public static al[] cjI()
    {
      if (xpw == null) {}
      synchronized (c.aCX)
      {
        if (xpw == null) {
          xpw = new al[0];
        }
        return xpw;
      }
    }
    
    public final void a(b paramb)
    {
      if (this.mXM != 0) {
        paramb.ao(1, this.mXM);
      }
      if (this.xpx != 0) {
        paramb.ao(2, this.xpx);
      }
      if (this.gHD != 0) {
        paramb.ao(3, this.gHD);
      }
      if (this.xpp != 0) {
        paramb.ao(4, this.xpp);
      }
      super.a(paramb);
    }
    
    protected final int nz()
    {
      int j = super.nz();
      int i = j;
      if (this.mXM != 0) {
        i = j + b.aq(1, this.mXM);
      }
      j = i;
      if (this.xpx != 0) {
        j = i + b.aq(2, this.xpx);
      }
      i = j;
      if (this.gHD != 0) {
        i = j + b.aq(3, this.gHD);
      }
      j = i;
      if (this.xpp != 0) {
        j = i + b.aq(4, this.xpp);
      }
      return j;
    }
  }
  
  public static final class am
    extends e
  {
    public int xpy = 0;
    public int xpz = 0;
    
    public am()
    {
      this.aCY = -1;
    }
    
    public final void a(b paramb)
    {
      if (this.xpy != 0) {
        paramb.ao(1, this.xpy);
      }
      if (this.xpz != 0) {
        paramb.ao(2, this.xpz);
      }
      super.a(paramb);
    }
    
    protected final int nz()
    {
      int j = super.nz();
      int i = j;
      if (this.xpy != 0) {
        i = j + b.aq(1, this.xpy);
      }
      j = i;
      if (this.xpz != 0) {
        j = i + b.aq(2, this.xpz);
      }
      return j;
    }
  }
  
  public static final class an
    extends e
  {
    public int oja = 0;
    
    public an()
    {
      this.aCY = -1;
    }
    
    public final void a(b paramb)
    {
      if (this.oja != 0) {
        paramb.ao(1, this.oja);
      }
      super.a(paramb);
    }
    
    protected final int nz()
    {
      int j = super.nz();
      int i = j;
      if (this.oja != 0) {
        i = j + b.aq(1, this.oja);
      }
      return i;
    }
  }
  
  public static final class ao
    extends e
  {
    private static volatile ao[] xpA;
    public int xpB = 0;
    public int xpC = 0;
    public byte[] xpD = g.aDf;
    
    public ao()
    {
      this.aCY = -1;
    }
    
    public static ao[] cjJ()
    {
      if (xpA == null) {}
      synchronized (c.aCX)
      {
        if (xpA == null) {
          xpA = new ao[0];
        }
        return xpA;
      }
    }
    
    public final void a(b paramb)
    {
      if (this.xpB != 0) {
        paramb.ao(1, this.xpB);
      }
      if (this.xpC != 0) {
        paramb.ao(2, this.xpC);
      }
      if (!Arrays.equals(this.xpD, g.aDf)) {
        paramb.a(3, this.xpD);
      }
      super.a(paramb);
    }
    
    protected final int nz()
    {
      int j = super.nz();
      int i = j;
      if (this.xpB != 0) {
        i = j + b.aq(1, this.xpB);
      }
      j = i;
      if (this.xpC != 0) {
        j = i + b.aq(2, this.xpC);
      }
      i = j;
      if (!Arrays.equals(this.xpD, g.aDf)) {
        i = j + b.b(3, this.xpD);
      }
      return i;
    }
  }
  
  public static final class ap
    extends e
  {
    public int htD = 0;
    public int htE = 0;
    public int xpE = 0;
    public int xpF = 0;
    public int xpG = 0;
    public int xpH = 0;
    public int xpI = 0;
    public int xpJ = 0;
    public int xpK = 0;
    public int xpL = 0;
    public int xpM = 0;
    public int xpN = 0;
    
    public ap()
    {
      this.aCY = -1;
    }
    
    public final void a(b paramb)
    {
      if (this.xpE != 0) {
        paramb.ao(1, this.xpE);
      }
      if (this.htD != 0) {
        paramb.ao(2, this.htD);
      }
      if (this.htE != 0) {
        paramb.ao(3, this.htE);
      }
      if (this.xpF != 0) {
        paramb.ao(4, this.xpF);
      }
      if (this.xpG != 0) {
        paramb.ao(5, this.xpG);
      }
      if (this.xpH != 0) {
        paramb.ao(6, this.xpH);
      }
      if (this.xpI != 0) {
        paramb.ao(7, this.xpI);
      }
      if (this.xpJ != 0) {
        paramb.ao(8, this.xpJ);
      }
      if (this.xpK != 0) {
        paramb.ao(9, this.xpK);
      }
      if (this.xpL != 0) {
        paramb.ao(10, this.xpL);
      }
      if (this.xpM != 0) {
        paramb.ao(11, this.xpM);
      }
      if (this.xpN != 0) {
        paramb.ao(12, this.xpN);
      }
      super.a(paramb);
    }
    
    protected final int nz()
    {
      int j = super.nz();
      int i = j;
      if (this.xpE != 0) {
        i = j + b.aq(1, this.xpE);
      }
      j = i;
      if (this.htD != 0) {
        j = i + b.aq(2, this.htD);
      }
      i = j;
      if (this.htE != 0) {
        i = j + b.aq(3, this.htE);
      }
      j = i;
      if (this.xpF != 0) {
        j = i + b.aq(4, this.xpF);
      }
      i = j;
      if (this.xpG != 0) {
        i = j + b.aq(5, this.xpG);
      }
      j = i;
      if (this.xpH != 0) {
        j = i + b.aq(6, this.xpH);
      }
      i = j;
      if (this.xpI != 0) {
        i = j + b.aq(7, this.xpI);
      }
      j = i;
      if (this.xpJ != 0) {
        j = i + b.aq(8, this.xpJ);
      }
      i = j;
      if (this.xpK != 0) {
        i = j + b.aq(9, this.xpK);
      }
      j = i;
      if (this.xpL != 0) {
        j = i + b.aq(10, this.xpL);
      }
      i = j;
      if (this.xpM != 0) {
        i = j + b.aq(11, this.xpM);
      }
      j = i;
      if (this.xpN != 0) {
        j = i + b.aq(12, this.xpN);
      }
      return j;
    }
  }
  
  public static final class aq
    extends e
  {
    public byte[] aHa = g.aDf;
    public int fBu = 0;
    public String name = "";
    public byte[] xpO = g.aDf;
    public long xpP = 0L;
    public byte[] xpQ = g.aDf;
    public byte[] xpR = g.aDf;
    public byte[] xpS = g.aDf;
    public a.au xpT = null;
    public byte[] xpU = g.aDf;
    public a.am xpV = null;
    public String xpW = "";
    public String xpX = "";
    public long xpY = 0L;
    public byte[] xpZ = g.aDf;
    public byte[] xqa = g.aDf;
    public byte[] xqb = g.aDf;
    public byte[] xqc = g.aDf;
    public int xqd = 0;
    public byte[] xqe = g.aDf;
    public byte[] xqf = g.aDf;
    public int xqg = 0;
    public a.m[] xqh = a.m.cjE();
    
    public aq()
    {
      this.aCY = -1;
    }
    
    public final void a(b paramb)
    {
      if (!this.name.equals("")) {
        paramb.e(1, this.name);
      }
      if (!Arrays.equals(this.xpO, g.aDf)) {
        paramb.a(2, this.xpO);
      }
      if (this.fBu != 0) {
        paramb.ao(3, this.fBu);
      }
      if (this.xpP != 0L) {
        paramb.f(4, this.xpP);
      }
      if (!Arrays.equals(this.xpQ, g.aDf)) {
        paramb.a(5, this.xpQ);
      }
      if (!Arrays.equals(this.xpR, g.aDf)) {
        paramb.a(6, this.xpR);
      }
      if (!Arrays.equals(this.xpS, g.aDf)) {
        paramb.a(7, this.xpS);
      }
      if (this.xpT != null) {
        paramb.a(8, this.xpT);
      }
      if (!Arrays.equals(this.xpU, g.aDf)) {
        paramb.a(9, this.xpU);
      }
      if (this.xpV != null) {
        paramb.a(10, this.xpV);
      }
      if (!this.xpW.equals("")) {
        paramb.e(100, this.xpW);
      }
      if (!this.xpX.equals("")) {
        paramb.e(101, this.xpX);
      }
      if (this.xpY != 0L) {
        paramb.f(200, this.xpY);
      }
      if (!Arrays.equals(this.xpZ, g.aDf)) {
        paramb.a(201, this.xpZ);
      }
      if (!Arrays.equals(this.xqa, g.aDf)) {
        paramb.a(202, this.xqa);
      }
      if (!Arrays.equals(this.xqb, g.aDf)) {
        paramb.a(203, this.xqb);
      }
      if (!Arrays.equals(this.xqc, g.aDf)) {
        paramb.a(204, this.xqc);
      }
      if (this.xqd != 0) {
        paramb.ao(220, this.xqd);
      }
      if (!Arrays.equals(this.xqe, g.aDf)) {
        paramb.a(221, this.xqe);
      }
      if (!Arrays.equals(this.xqf, g.aDf)) {
        paramb.a(222, this.xqf);
      }
      if (!Arrays.equals(this.aHa, g.aDf)) {
        paramb.a(223, this.aHa);
      }
      if (this.xqg != 0) {
        paramb.ap(224, this.xqg);
      }
      if ((this.xqh != null) && (this.xqh.length > 0))
      {
        int i = 0;
        while (i < this.xqh.length)
        {
          a.m localm = this.xqh[i];
          if (localm != null) {
            paramb.a(225, localm);
          }
          i += 1;
        }
      }
      super.a(paramb);
    }
    
    protected final int nz()
    {
      int j = super.nz();
      int i = j;
      if (!this.name.equals("")) {
        i = j + b.f(1, this.name);
      }
      j = i;
      if (!Arrays.equals(this.xpO, g.aDf)) {
        j = i + b.b(2, this.xpO);
      }
      i = j;
      if (this.fBu != 0) {
        i = j + b.aq(3, this.fBu);
      }
      j = i;
      if (this.xpP != 0L) {
        j = i + b.h(4, this.xpP);
      }
      i = j;
      if (!Arrays.equals(this.xpQ, g.aDf)) {
        i = j + b.b(5, this.xpQ);
      }
      j = i;
      if (!Arrays.equals(this.xpR, g.aDf)) {
        j = i + b.b(6, this.xpR);
      }
      i = j;
      if (!Arrays.equals(this.xpS, g.aDf)) {
        i = j + b.b(7, this.xpS);
      }
      j = i;
      if (this.xpT != null) {
        j = i + b.b(8, this.xpT);
      }
      i = j;
      if (!Arrays.equals(this.xpU, g.aDf)) {
        i = j + b.b(9, this.xpU);
      }
      j = i;
      if (this.xpV != null) {
        j = i + b.b(10, this.xpV);
      }
      i = j;
      if (!this.xpW.equals("")) {
        i = j + b.f(100, this.xpW);
      }
      j = i;
      if (!this.xpX.equals("")) {
        j = i + b.f(101, this.xpX);
      }
      i = j;
      if (this.xpY != 0L) {
        i = j + b.h(200, this.xpY);
      }
      j = i;
      if (!Arrays.equals(this.xpZ, g.aDf)) {
        j = i + b.b(201, this.xpZ);
      }
      i = j;
      if (!Arrays.equals(this.xqa, g.aDf)) {
        i = j + b.b(202, this.xqa);
      }
      j = i;
      if (!Arrays.equals(this.xqb, g.aDf)) {
        j = i + b.b(203, this.xqb);
      }
      i = j;
      if (!Arrays.equals(this.xqc, g.aDf)) {
        i = j + b.b(204, this.xqc);
      }
      j = i;
      if (this.xqd != 0) {
        j = i + b.aq(220, this.xqd);
      }
      i = j;
      if (!Arrays.equals(this.xqe, g.aDf)) {
        i = j + b.b(221, this.xqe);
      }
      j = i;
      if (!Arrays.equals(this.xqf, g.aDf)) {
        j = i + b.b(222, this.xqf);
      }
      int k = j;
      if (!Arrays.equals(this.aHa, g.aDf)) {
        k = j + b.b(223, this.aHa);
      }
      i = k;
      if (this.xqg != 0) {
        i = k + b.ar(224, this.xqg);
      }
      j = i;
      if (this.xqh != null)
      {
        j = i;
        if (this.xqh.length > 0)
        {
          j = 0;
          while (j < this.xqh.length)
          {
            a.m localm = this.xqh[j];
            k = i;
            if (localm != null) {
              k = i + b.b(225, localm);
            }
            j += 1;
            i = k;
          }
          j = i;
        }
      }
      return j;
    }
  }
  
  public static final class ar
    extends e
  {
    private static volatile ar[] xqi;
    public String groupId = "";
    public int rph = 0;
    public long rpi = 0L;
    public int xnS = 0;
    public a.as[] xpe = a.as.cjL();
    public String xqj = "";
    
    public ar()
    {
      this.aCY = -1;
    }
    
    public static ar[] cjK()
    {
      if (xqi == null) {}
      synchronized (c.aCX)
      {
        if (xqi == null) {
          xqi = new ar[0];
        }
        return xqi;
      }
    }
    
    public final void a(b paramb)
    {
      if (!this.groupId.equals("")) {
        paramb.e(1, this.groupId);
      }
      if (this.rph != 0) {
        paramb.ao(2, this.rph);
      }
      if (this.rpi != 0L) {
        paramb.g(3, this.rpi);
      }
      if ((this.xpe != null) && (this.xpe.length > 0))
      {
        int i = 0;
        while (i < this.xpe.length)
        {
          a.as localas = this.xpe[i];
          if (localas != null) {
            paramb.a(4, localas);
          }
          i += 1;
        }
      }
      if (this.xnS != 0) {
        paramb.ap(5, this.xnS);
      }
      if (!this.xqj.equals("")) {
        paramb.e(6, this.xqj);
      }
      super.a(paramb);
    }
    
    protected final int nz()
    {
      int j = super.nz();
      int i = j;
      if (!this.groupId.equals("")) {
        i = j + b.f(1, this.groupId);
      }
      j = i;
      if (this.rph != 0) {
        j = i + b.aq(2, this.rph);
      }
      i = j;
      if (this.rpi != 0L) {
        i = j + b.i(3, this.rpi);
      }
      j = i;
      if (this.xpe != null)
      {
        j = i;
        if (this.xpe.length > 0)
        {
          j = 0;
          while (j < this.xpe.length)
          {
            a.as localas = this.xpe[j];
            int k = i;
            if (localas != null) {
              k = i + b.b(4, localas);
            }
            j += 1;
            i = k;
          }
          j = i;
        }
      }
      i = j;
      if (this.xnS != 0) {
        i = j + b.ar(5, this.xnS);
      }
      j = i;
      if (!this.xqj.equals("")) {
        j = i + b.f(6, this.xqj);
      }
      return j;
    }
  }
  
  public static final class as
    extends e
  {
    private static volatile as[] xqk;
    public int fFs = 0;
    public int mXM = -1;
    public int rzY = 0;
    public int status = 0;
    public int trb = 0;
    public int xnY = 0;
    public byte[] xod = g.aDf;
    public String xps = "";
    public a.q xqA = null;
    public int xqB = -1;
    public String xqC = "";
    public int xqD = 0;
    public int xqE = 0;
    public int xqF = 0;
    public int xqG = 0;
    public int xql = 0;
    public int xqm = 0;
    public a.an xqn = null;
    public int xqo = 0;
    public String xqp = "";
    public a.ao[] xqq = a.ao.cjJ();
    public int xqr = 0;
    public int[] xqs = g.aCZ;
    public int xqt = 0;
    public int xqu = 0;
    public int xqv = 0;
    public int xqw = 0;
    public a.ak xqx = null;
    public String xqy = "";
    public int xqz = 0;
    
    public as()
    {
      this.aCY = -1;
    }
    
    public static as[] cjL()
    {
      if (xqk == null) {}
      synchronized (c.aCX)
      {
        if (xqk == null) {
          xqk = new as[0];
        }
        return xqk;
      }
    }
    
    public final void a(b paramb)
    {
      int j = 0;
      if (this.trb != 0) {
        paramb.ap(1, this.trb);
      }
      if (this.xql != 0) {
        paramb.ap(2, this.xql);
      }
      if (this.status != 0) {
        paramb.ap(3, this.status);
      }
      if (this.fFs != 0) {
        paramb.ap(4, this.fFs);
      }
      if (this.mXM != -1) {
        paramb.ao(5, this.mXM);
      }
      if (this.xqm != 0) {
        paramb.ap(6, this.xqm);
      }
      if (this.xqn != null) {
        paramb.a(7, this.xqn);
      }
      if (this.xqo != 0) {
        paramb.ap(8, this.xqo);
      }
      if (!this.xqp.equals("")) {
        paramb.e(9, this.xqp);
      }
      int i;
      if ((this.xqq != null) && (this.xqq.length > 0))
      {
        i = 0;
        while (i < this.xqq.length)
        {
          a.ao localao = this.xqq[i];
          if (localao != null) {
            paramb.a(10, localao);
          }
          i += 1;
        }
      }
      if (this.xqr != 0) {
        paramb.ap(11, this.xqr);
      }
      if ((this.xqs != null) && (this.xqs.length > 0))
      {
        i = j;
        while (i < this.xqs.length)
        {
          paramb.ap(12, this.xqs[i]);
          i += 1;
        }
      }
      if (this.xqt != 0) {
        paramb.ap(13, this.xqt);
      }
      if (this.xqu != 0) {
        paramb.ap(14, this.xqu);
      }
      if (this.xqv != 0) {
        paramb.ap(15, this.xqv);
      }
      if (this.xqw != 0) {
        paramb.ap(16, this.xqw);
      }
      if (this.xqx != null) {
        paramb.a(17, this.xqx);
      }
      if (!this.xps.equals("")) {
        paramb.e(100, this.xps);
      }
      if (!this.xqy.equals("")) {
        paramb.e(101, this.xqy);
      }
      if (this.xqz != 0) {
        paramb.ap(102, this.xqz);
      }
      if (!Arrays.equals(this.xod, g.aDf)) {
        paramb.a(200, this.xod);
      }
      if (this.xqA != null) {
        paramb.a(201, this.xqA);
      }
      if (this.xqB != -1) {
        paramb.ao(202, this.xqB);
      }
      if (!this.xqC.equals("")) {
        paramb.e(203, this.xqC);
      }
      if (this.xqD != 0) {
        paramb.ao(204, this.xqD);
      }
      if (this.xqE != 0) {
        paramb.ap(205, this.xqE);
      }
      if (this.rzY != 0) {
        paramb.ap(206, this.rzY);
      }
      if (this.xqF != 0) {
        paramb.ap(207, this.xqF);
      }
      if (this.xqG != 0) {
        paramb.ap(208, this.xqG);
      }
      if (this.xnY != 0) {
        paramb.ap(240, this.xnY);
      }
      super.a(paramb);
    }
    
    protected final int nz()
    {
      int m = 0;
      int j = super.nz();
      int i = j;
      if (this.trb != 0) {
        i = j + b.ar(1, this.trb);
      }
      j = i;
      if (this.xql != 0) {
        j = i + b.ar(2, this.xql);
      }
      i = j;
      if (this.status != 0) {
        i = j + b.ar(3, this.status);
      }
      j = i;
      if (this.fFs != 0) {
        j = i + b.ar(4, this.fFs);
      }
      i = j;
      if (this.mXM != -1) {
        i = j + b.aq(5, this.mXM);
      }
      j = i;
      if (this.xqm != 0) {
        j = i + b.ar(6, this.xqm);
      }
      i = j;
      if (this.xqn != null) {
        i = j + b.b(7, this.xqn);
      }
      j = i;
      if (this.xqo != 0) {
        j = i + b.ar(8, this.xqo);
      }
      i = j;
      if (!this.xqp.equals("")) {
        i = j + b.f(9, this.xqp);
      }
      j = i;
      int k;
      if (this.xqq != null)
      {
        j = i;
        if (this.xqq.length > 0)
        {
          j = 0;
          while (j < this.xqq.length)
          {
            a.ao localao = this.xqq[j];
            k = i;
            if (localao != null) {
              k = i + b.b(10, localao);
            }
            j += 1;
            i = k;
          }
          j = i;
        }
      }
      i = j;
      if (this.xqr != 0) {
        i = j + b.ar(11, this.xqr);
      }
      j = i;
      if (this.xqs != null)
      {
        j = i;
        if (this.xqs.length > 0)
        {
          k = 0;
          j = m;
          while (j < this.xqs.length)
          {
            k += b.cM(this.xqs[j]);
            j += 1;
          }
          j = i + k + this.xqs.length * 1;
        }
      }
      i = j;
      if (this.xqt != 0) {
        i = j + b.ar(13, this.xqt);
      }
      j = i;
      if (this.xqu != 0) {
        j = i + b.ar(14, this.xqu);
      }
      i = j;
      if (this.xqv != 0) {
        i = j + b.ar(15, this.xqv);
      }
      j = i;
      if (this.xqw != 0) {
        j = i + b.ar(16, this.xqw);
      }
      i = j;
      if (this.xqx != null) {
        i = j + b.b(17, this.xqx);
      }
      j = i;
      if (!this.xps.equals("")) {
        j = i + b.f(100, this.xps);
      }
      i = j;
      if (!this.xqy.equals("")) {
        i = j + b.f(101, this.xqy);
      }
      j = i;
      if (this.xqz != 0) {
        j = i + b.ar(102, this.xqz);
      }
      i = j;
      if (!Arrays.equals(this.xod, g.aDf)) {
        i = j + b.b(200, this.xod);
      }
      j = i;
      if (this.xqA != null) {
        j = i + b.b(201, this.xqA);
      }
      i = j;
      if (this.xqB != -1) {
        i = j + b.aq(202, this.xqB);
      }
      j = i;
      if (!this.xqC.equals("")) {
        j = i + b.f(203, this.xqC);
      }
      i = j;
      if (this.xqD != 0) {
        i = j + b.aq(204, this.xqD);
      }
      j = i;
      if (this.xqE != 0) {
        j = i + b.ar(205, this.xqE);
      }
      i = j;
      if (this.rzY != 0) {
        i = j + b.ar(206, this.rzY);
      }
      j = i;
      if (this.xqF != 0) {
        j = i + b.ar(207, this.xqF);
      }
      i = j;
      if (this.xqG != 0) {
        i = j + b.ar(208, this.xqG);
      }
      j = i;
      if (this.xnY != 0) {
        j = i + b.ar(240, this.xnY);
      }
      return j;
    }
  }
  
  public static final class at
    extends e
  {
    private static volatile at[] xqH;
    public String oRV = "";
    public int trb = 0;
    public String username = "";
    public long xqI = 0L;
    public String xqJ = "";
    public String xqK = "";
    
    public at()
    {
      this.aCY = -1;
    }
    
    public static at[] cjM()
    {
      if (xqH == null) {}
      synchronized (c.aCX)
      {
        if (xqH == null) {
          xqH = new at[0];
        }
        return xqH;
      }
    }
    
    public final void a(b paramb)
    {
      if (this.trb != 0) {
        paramb.ap(1, this.trb);
      }
      if (!this.username.equals("")) {
        paramb.e(2, this.username);
      }
      if (!this.oRV.equals("")) {
        paramb.e(3, this.oRV);
      }
      if (this.xqI != 0L) {
        paramb.f(4, this.xqI);
      }
      if (!this.xqJ.equals("")) {
        paramb.e(5, this.xqJ);
      }
      if (!this.xqK.equals("")) {
        paramb.e(6, this.xqK);
      }
      super.a(paramb);
    }
    
    protected final int nz()
    {
      int j = super.nz();
      int i = j;
      if (this.trb != 0) {
        i = j + b.ar(1, this.trb);
      }
      j = i;
      if (!this.username.equals("")) {
        j = i + b.f(2, this.username);
      }
      i = j;
      if (!this.oRV.equals("")) {
        i = j + b.f(3, this.oRV);
      }
      j = i;
      if (this.xqI != 0L) {
        j = i + b.h(4, this.xqI);
      }
      i = j;
      if (!this.xqJ.equals("")) {
        i = j + b.f(5, this.xqJ);
      }
      j = i;
      if (!this.xqK.equals("")) {
        j = i + b.f(6, this.xqK);
      }
      return j;
    }
  }
  
  public static final class au
    extends e
  {
    public int xqL = 0;
    
    public au()
    {
      this.aCY = -1;
    }
    
    public final void a(b paramb)
    {
      if (this.xqL != 0) {
        paramb.ap(1, this.xqL);
      }
      super.a(paramb);
    }
    
    protected final int nz()
    {
      int j = super.nz();
      int i = j;
      if (this.xqL != 0) {
        i = j + b.ar(1, this.xqL);
      }
      return i;
    }
  }
  
  public static final class av
    extends e
  {
    public int rph = 0;
    public long rpi = 0L;
    public int xqM = 0;
    
    public av()
    {
      this.aCY = -1;
    }
    
    public final void a(b paramb)
    {
      if (this.rph != 0) {
        paramb.ao(1, this.rph);
      }
      if (this.rpi != 0L) {
        paramb.g(2, this.rpi);
      }
      if (this.xqM != 0) {
        paramb.ap(3, this.xqM);
      }
      super.a(paramb);
    }
    
    protected final int nz()
    {
      int j = super.nz();
      int i = j;
      if (this.rph != 0) {
        i = j + b.aq(1, this.rph);
      }
      j = i;
      if (this.rpi != 0L) {
        j = i + b.i(2, this.rpi);
      }
      i = j;
      if (this.xqM != 0) {
        i = j + b.ar(3, this.xqM);
      }
      return i;
    }
  }
  
  public static final class aw
    extends e
  {
    private static volatile aw[] xqN;
    public int kKY = 0;
    public int xqO = 0;
    public int xqP = 0;
    public int xqQ = 0;
    public int xqR = 0;
    
    public aw()
    {
      this.aCY = -1;
    }
    
    public static aw[] cjN()
    {
      if (xqN == null) {}
      synchronized (c.aCX)
      {
        if (xqN == null) {
          xqN = new aw[0];
        }
        return xqN;
      }
    }
    
    public final void a(b paramb)
    {
      if (this.kKY != 0) {
        paramb.ao(1, this.kKY);
      }
      if (this.xqO != 0) {
        paramb.ao(2, this.xqO);
      }
      if (this.xqP != 0) {
        paramb.ao(3, this.xqP);
      }
      if (this.xqQ != 0) {
        paramb.ao(4, this.xqQ);
      }
      if (this.xqR != 0) {
        paramb.ao(5, this.xqR);
      }
      super.a(paramb);
    }
    
    protected final int nz()
    {
      int j = super.nz();
      int i = j;
      if (this.kKY != 0) {
        i = j + b.aq(1, this.kKY);
      }
      j = i;
      if (this.xqO != 0) {
        j = i + b.aq(2, this.xqO);
      }
      i = j;
      if (this.xqP != 0) {
        i = j + b.aq(3, this.xqP);
      }
      j = i;
      if (this.xqQ != 0) {
        j = i + b.aq(4, this.xqQ);
      }
      i = j;
      if (this.xqR != 0) {
        i = j + b.aq(5, this.xqR);
      }
      return i;
    }
  }
  
  public static final class ax
    extends e
  {
    public int type = 0;
    public a.ai xqS = null;
    
    public ax()
    {
      this.aCY = -1;
    }
    
    public final void a(b paramb)
    {
      if (this.type != 0) {
        paramb.ao(1, this.type);
      }
      if (this.xqS != null) {
        paramb.a(2, this.xqS);
      }
      super.a(paramb);
    }
    
    protected final int nz()
    {
      int j = super.nz();
      int i = j;
      if (this.type != 0) {
        i = j + b.aq(1, this.type);
      }
      j = i;
      if (this.xqS != null) {
        j = i + b.b(2, this.xqS);
      }
      return j;
    }
  }
  
  public static final class ay
    extends e
  {
    public String groupId = "";
    public int rph = 0;
    public long rpi = 0L;
    public int xnS = 0;
    public a.as[] xpe = a.as.cjL();
    public int xqT = 0;
    public String xqU = "";
    public String[] xqV = g.EMPTY_STRING_ARRAY;
    public long xqW = 0L;
    public String xqj = "";
    
    public ay()
    {
      this.aCY = -1;
    }
    
    public final void a(b paramb)
    {
      int j = 0;
      if (!this.groupId.equals("")) {
        paramb.e(1, this.groupId);
      }
      if (this.rph != 0) {
        paramb.ao(2, this.rph);
      }
      if (this.rpi != 0L) {
        paramb.g(3, this.rpi);
      }
      if (this.xnS != 0) {
        paramb.ap(4, this.xnS);
      }
      if (this.xqT != 0) {
        paramb.ao(5, this.xqT);
      }
      if (!this.xqj.equals("")) {
        paramb.e(6, this.xqj);
      }
      int i;
      Object localObject;
      if ((this.xpe != null) && (this.xpe.length > 0))
      {
        i = 0;
        while (i < this.xpe.length)
        {
          localObject = this.xpe[i];
          if (localObject != null) {
            paramb.a(7, (e)localObject);
          }
          i += 1;
        }
      }
      if (!this.xqU.equals("")) {
        paramb.e(8, this.xqU);
      }
      if ((this.xqV != null) && (this.xqV.length > 0))
      {
        i = j;
        while (i < this.xqV.length)
        {
          localObject = this.xqV[i];
          if (localObject != null) {
            paramb.e(9, (String)localObject);
          }
          i += 1;
        }
      }
      if (this.xqW != 0L) {
        paramb.f(10, this.xqW);
      }
      super.a(paramb);
    }
    
    protected final int nz()
    {
      int n = 0;
      int j = super.nz();
      int i = j;
      if (!this.groupId.equals("")) {
        i = j + b.f(1, this.groupId);
      }
      j = i;
      if (this.rph != 0) {
        j = i + b.aq(2, this.rph);
      }
      i = j;
      if (this.rpi != 0L) {
        i = j + b.i(3, this.rpi);
      }
      j = i;
      if (this.xnS != 0) {
        j = i + b.ar(4, this.xnS);
      }
      int k = j;
      if (this.xqT != 0) {
        k = j + b.aq(5, this.xqT);
      }
      i = k;
      if (!this.xqj.equals("")) {
        i = k + b.f(6, this.xqj);
      }
      j = i;
      Object localObject;
      if (this.xpe != null)
      {
        j = i;
        if (this.xpe.length > 0)
        {
          j = 0;
          while (j < this.xpe.length)
          {
            localObject = this.xpe[j];
            k = i;
            if (localObject != null) {
              k = i + b.b(7, (e)localObject);
            }
            j += 1;
            i = k;
          }
          j = i;
        }
      }
      i = j;
      if (!this.xqU.equals("")) {
        i = j + b.f(8, this.xqU);
      }
      j = i;
      if (this.xqV != null)
      {
        j = i;
        if (this.xqV.length > 0)
        {
          k = 0;
          int m = 0;
          j = n;
          while (j < this.xqV.length)
          {
            localObject = this.xqV[j];
            int i1 = k;
            n = m;
            if (localObject != null)
            {
              n = m + 1;
              i1 = k + b.aF((String)localObject);
            }
            j += 1;
            k = i1;
            m = n;
          }
          j = i + k + m * 1;
        }
      }
      i = j;
      if (this.xqW != 0L) {
        i = j + b.h(10, this.xqW);
      }
      return i;
    }
  }
  
  public static final class b
    extends e
  {
    public int fFs = 0;
    public String xnN = "";
    
    public b()
    {
      this.aCY = -1;
    }
    
    public final void a(b paramb)
    {
      if (!this.xnN.equals("")) {
        paramb.e(1, this.xnN);
      }
      if (this.fFs != 0) {
        paramb.ao(2, this.fFs);
      }
      super.a(paramb);
    }
    
    protected final int nz()
    {
      int j = super.nz();
      int i = j;
      if (!this.xnN.equals("")) {
        i = j + b.f(1, this.xnN);
      }
      j = i;
      if (this.fFs != 0) {
        j = i + b.aq(2, this.fFs);
      }
      return j;
    }
  }
  
  public static final class c
    extends e
  {
    public a.u[] xnO = a.u.cjG();
    
    public c()
    {
      this.aCY = -1;
    }
    
    public final void a(b paramb)
    {
      if ((this.xnO != null) && (this.xnO.length > 0))
      {
        int i = 0;
        while (i < this.xnO.length)
        {
          a.u localu = this.xnO[i];
          if (localu != null) {
            paramb.a(1, localu);
          }
          i += 1;
        }
      }
      super.a(paramb);
    }
    
    protected final int nz()
    {
      int i = super.nz();
      int k = i;
      if (this.xnO != null)
      {
        k = i;
        if (this.xnO.length > 0)
        {
          int j = 0;
          for (;;)
          {
            k = i;
            if (j >= this.xnO.length) {
              break;
            }
            a.u localu = this.xnO[j];
            k = i;
            if (localu != null) {
              k = i + b.b(1, localu);
            }
            j += 1;
            i = k;
          }
        }
      }
      return k;
    }
  }
  
  public static final class d
    extends e
  {
    public String xnN = "";
    public a.aq xnP = null;
    public int[] xnQ = g.aCZ;
    public a.ax xnR = null;
    public int xnS = 0;
    public int xnT = 0;
    public a.av xnU = null;
    public String xnV = "";
    public String[] xnW = g.EMPTY_STRING_ARRAY;
    public a.l[] xnX = a.l.cjD();
    public int xnY = 0;
    
    public d()
    {
      this.aCY = -1;
    }
    
    public final void a(b paramb)
    {
      int j = 0;
      if (this.xnP != null) {
        paramb.a(1, this.xnP);
      }
      int i;
      if ((this.xnQ != null) && (this.xnQ.length > 0))
      {
        i = 0;
        while (i < this.xnQ.length)
        {
          paramb.ap(2, this.xnQ[i]);
          i += 1;
        }
      }
      if (this.xnR != null) {
        paramb.a(3, this.xnR);
      }
      if (this.xnS != 0) {
        paramb.ap(4, this.xnS);
      }
      if (this.xnT != 0) {
        paramb.ap(5, this.xnT);
      }
      if (this.xnU != null) {
        paramb.a(6, this.xnU);
      }
      if (!this.xnN.equals("")) {
        paramb.e(7, this.xnN);
      }
      if (!this.xnV.equals("")) {
        paramb.e(8, this.xnV);
      }
      Object localObject;
      if ((this.xnW != null) && (this.xnW.length > 0))
      {
        i = 0;
        while (i < this.xnW.length)
        {
          localObject = this.xnW[i];
          if (localObject != null) {
            paramb.e(100, (String)localObject);
          }
          i += 1;
        }
      }
      if ((this.xnX != null) && (this.xnX.length > 0))
      {
        i = j;
        while (i < this.xnX.length)
        {
          localObject = this.xnX[i];
          if (localObject != null) {
            paramb.a(202, (e)localObject);
          }
          i += 1;
        }
      }
      if (this.xnY != 0) {
        paramb.ap(240, this.xnY);
      }
      super.a(paramb);
    }
    
    protected final int nz()
    {
      int i2 = 0;
      int j = super.nz();
      int i = j;
      if (this.xnP != null) {
        i = j + b.b(1, this.xnP);
      }
      j = i;
      int k;
      if (this.xnQ != null)
      {
        j = i;
        if (this.xnQ.length > 0)
        {
          j = 0;
          k = 0;
          while (j < this.xnQ.length)
          {
            k += b.cM(this.xnQ[j]);
            j += 1;
          }
          j = i + k + this.xnQ.length * 1;
        }
      }
      i = j;
      if (this.xnR != null) {
        i = j + b.b(3, this.xnR);
      }
      j = i;
      if (this.xnS != 0) {
        j = i + b.ar(4, this.xnS);
      }
      i = j;
      if (this.xnT != 0) {
        i = j + b.ar(5, this.xnT);
      }
      j = i;
      if (this.xnU != null) {
        j = i + b.b(6, this.xnU);
      }
      i = j;
      if (!this.xnN.equals("")) {
        i = j + b.f(7, this.xnN);
      }
      j = i;
      if (!this.xnV.equals("")) {
        j = i + b.f(8, this.xnV);
      }
      i = j;
      Object localObject;
      if (this.xnW != null)
      {
        i = j;
        if (this.xnW.length > 0)
        {
          i = 0;
          k = 0;
          int n;
          for (int m = 0; i < this.xnW.length; m = n)
          {
            localObject = this.xnW[i];
            int i1 = k;
            n = m;
            if (localObject != null)
            {
              n = m + 1;
              i1 = k + b.aF((String)localObject);
            }
            i += 1;
            k = i1;
          }
          i = j + k + m * 2;
        }
      }
      j = i;
      if (this.xnX != null)
      {
        j = i;
        if (this.xnX.length > 0)
        {
          k = i2;
          for (;;)
          {
            j = i;
            if (k >= this.xnX.length) {
              break;
            }
            localObject = this.xnX[k];
            j = i;
            if (localObject != null) {
              j = i + b.b(202, (e)localObject);
            }
            k += 1;
            i = j;
          }
        }
      }
      i = j;
      if (this.xnY != 0) {
        i = j + b.ar(240, this.xnY);
      }
      return i;
    }
  }
  
  public static final class e
    extends e
  {
    public String groupId = "";
    public int rph = 0;
    public long rpi = 0L;
    public int xnL = 0;
    public a.aq xnP = null;
    public a.ax xnR = null;
    public int xnT = 0;
    public String[] xnW = g.EMPTY_STRING_ARRAY;
    public a.l[] xnX = a.l.cjD();
    public int xnY = 0;
    public int xnZ = 0;
    public a.q xoa = null;
    public int xob = 0;
    
    public e()
    {
      this.aCY = -1;
    }
    
    public final void a(b paramb)
    {
      int j = 0;
      if (!this.groupId.equals("")) {
        paramb.e(1, this.groupId);
      }
      if (this.rph != 0) {
        paramb.ao(2, this.rph);
      }
      if (this.rpi != 0L) {
        paramb.g(3, this.rpi);
      }
      if (this.xnR != null) {
        paramb.a(4, this.xnR);
      }
      if (this.xnZ != 0) {
        paramb.ao(5, this.xnZ);
      }
      if (this.xnT != 0) {
        paramb.ap(6, this.xnT);
      }
      if (this.xnL != 0) {
        paramb.ao(7, this.xnL);
      }
      if (this.xnP != null) {
        paramb.a(200, this.xnP);
      }
      int i;
      Object localObject;
      if ((this.xnW != null) && (this.xnW.length > 0))
      {
        i = 0;
        while (i < this.xnW.length)
        {
          localObject = this.xnW[i];
          if (localObject != null) {
            paramb.e(201, (String)localObject);
          }
          i += 1;
        }
      }
      if ((this.xnX != null) && (this.xnX.length > 0))
      {
        i = j;
        while (i < this.xnX.length)
        {
          localObject = this.xnX[i];
          if (localObject != null) {
            paramb.a(202, (e)localObject);
          }
          i += 1;
        }
      }
      if (this.xoa != null) {
        paramb.a(203, this.xoa);
      }
      if (this.xob != 0) {
        paramb.ap(204, this.xob);
      }
      if (this.xnY != 0) {
        paramb.ap(240, this.xnY);
      }
      super.a(paramb);
    }
    
    protected final int nz()
    {
      int i2 = 0;
      int j = super.nz();
      int i = j;
      if (!this.groupId.equals("")) {
        i = j + b.f(1, this.groupId);
      }
      j = i;
      if (this.rph != 0) {
        j = i + b.aq(2, this.rph);
      }
      i = j;
      if (this.rpi != 0L) {
        i = j + b.i(3, this.rpi);
      }
      j = i;
      if (this.xnR != null) {
        j = i + b.b(4, this.xnR);
      }
      i = j;
      if (this.xnZ != 0) {
        i = j + b.aq(5, this.xnZ);
      }
      j = i;
      if (this.xnT != 0) {
        j = i + b.ar(6, this.xnT);
      }
      i = j;
      if (this.xnL != 0) {
        i = j + b.aq(7, this.xnL);
      }
      j = i;
      if (this.xnP != null) {
        j = i + b.b(200, this.xnP);
      }
      i = j;
      int k;
      Object localObject;
      if (this.xnW != null)
      {
        i = j;
        if (this.xnW.length > 0)
        {
          i = 0;
          k = 0;
          int n;
          for (int m = 0; i < this.xnW.length; m = n)
          {
            localObject = this.xnW[i];
            int i1 = k;
            n = m;
            if (localObject != null)
            {
              n = m + 1;
              i1 = k + b.aF((String)localObject);
            }
            i += 1;
            k = i1;
          }
          i = j + k + m * 2;
        }
      }
      j = i;
      if (this.xnX != null)
      {
        j = i;
        if (this.xnX.length > 0)
        {
          k = i2;
          for (;;)
          {
            j = i;
            if (k >= this.xnX.length) {
              break;
            }
            localObject = this.xnX[k];
            j = i;
            if (localObject != null) {
              j = i + b.b(202, (e)localObject);
            }
            k += 1;
            i = j;
          }
        }
      }
      i = j;
      if (this.xoa != null) {
        i = j + b.b(203, this.xoa);
      }
      j = i;
      if (this.xob != 0) {
        j = i + b.ar(204, this.xob);
      }
      i = j;
      if (this.xnY != 0) {
        i = j + b.ar(240, this.xnY);
      }
      return i;
    }
  }
  
  public static final class f
    extends e
  {
    public int fFs = 0;
    public String groupId = "";
    public int rph = 0;
    public long rpi = 0L;
    public int xoc = 0;
    
    public f()
    {
      this.aCY = -1;
    }
    
    public final void a(b paramb)
    {
      if (!this.groupId.equals("")) {
        paramb.e(1, this.groupId);
      }
      if (this.rph != 0) {
        paramb.ao(2, this.rph);
      }
      if (this.rpi != 0L) {
        paramb.g(3, this.rpi);
      }
      if (this.fFs != 0) {
        paramb.ao(4, this.fFs);
      }
      if (this.xoc != 0) {
        paramb.ao(5, this.xoc);
      }
      super.a(paramb);
    }
    
    protected final int nz()
    {
      int j = super.nz();
      int i = j;
      if (!this.groupId.equals("")) {
        i = j + b.f(1, this.groupId);
      }
      j = i;
      if (this.rph != 0) {
        j = i + b.aq(2, this.rph);
      }
      i = j;
      if (this.rpi != 0L) {
        i = j + b.i(3, this.rpi);
      }
      j = i;
      if (this.fFs != 0) {
        j = i + b.aq(4, this.fFs);
      }
      i = j;
      if (this.xoc != 0) {
        i = j + b.aq(5, this.xoc);
      }
      return i;
    }
  }
  
  public static final class g
    extends e
  {
    public int fFs = 0;
    public String groupId = "";
    public int rph = 0;
    public long rpi = 0L;
    public String xnN = "";
    
    public g()
    {
      this.aCY = -1;
    }
    
    public final void a(b paramb)
    {
      if (!this.groupId.equals("")) {
        paramb.e(1, this.groupId);
      }
      if (this.rph != 0) {
        paramb.ao(2, this.rph);
      }
      if (this.rpi != 0L) {
        paramb.g(3, this.rpi);
      }
      if (this.fFs != 0) {
        paramb.ao(4, this.fFs);
      }
      if (!this.xnN.equals("")) {
        paramb.e(5, this.xnN);
      }
      super.a(paramb);
    }
    
    protected final int nz()
    {
      int j = super.nz();
      int i = j;
      if (!this.groupId.equals("")) {
        i = j + b.f(1, this.groupId);
      }
      j = i;
      if (this.rph != 0) {
        j = i + b.aq(2, this.rph);
      }
      i = j;
      if (this.rpi != 0L) {
        i = j + b.i(3, this.rpi);
      }
      j = i;
      if (this.fFs != 0) {
        j = i + b.aq(4, this.fFs);
      }
      i = j;
      if (!this.xnN.equals("")) {
        i = j + b.f(5, this.xnN);
      }
      return i;
    }
  }
  
  public static final class h
    extends e
  {
    public int action = 0;
    public String groupId = "";
    public int mXg = 0;
    public long mXh = 0L;
    
    public h()
    {
      this.aCY = -1;
    }
    
    public final void a(b paramb)
    {
      paramb.ap(1, this.action);
      paramb.ao(2, this.mXg);
      paramb.g(3, this.mXh);
      if (!this.groupId.equals("")) {
        paramb.e(4, this.groupId);
      }
      super.a(paramb);
    }
    
    protected final int nz()
    {
      int j = super.nz() + b.ar(1, this.action) + b.aq(2, this.mXg) + b.i(3, this.mXh);
      int i = j;
      if (!this.groupId.equals("")) {
        i = j + b.f(4, this.groupId);
      }
      return i;
    }
  }
  
  public static final class i
    extends e
  {
    public String groupId = "";
    public int rph = 0;
    public long rpi = 0L;
    public a.ax xnR = null;
    public int xnT = 0;
    public byte[] xod = g.aDf;
    
    public i()
    {
      this.aCY = -1;
    }
    
    public final void a(b paramb)
    {
      if (!this.groupId.equals("")) {
        paramb.e(1, this.groupId);
      }
      if (this.rph != 0) {
        paramb.ao(2, this.rph);
      }
      if (this.rpi != 0L) {
        paramb.g(3, this.rpi);
      }
      if (this.xnR != null) {
        paramb.a(4, this.xnR);
      }
      if (this.xnT != 0) {
        paramb.ap(5, this.xnT);
      }
      if (!Arrays.equals(this.xod, g.aDf)) {
        paramb.a(200, this.xod);
      }
      super.a(paramb);
    }
    
    protected final int nz()
    {
      int j = super.nz();
      int i = j;
      if (!this.groupId.equals("")) {
        i = j + b.f(1, this.groupId);
      }
      j = i;
      if (this.rph != 0) {
        j = i + b.aq(2, this.rph);
      }
      i = j;
      if (this.rpi != 0L) {
        i = j + b.i(3, this.rpi);
      }
      j = i;
      if (this.xnR != null) {
        j = i + b.b(4, this.xnR);
      }
      i = j;
      if (this.xnT != 0) {
        i = j + b.ar(5, this.xnT);
      }
      j = i;
      if (!Arrays.equals(this.xod, g.aDf)) {
        j = i + b.b(200, this.xod);
      }
      return j;
    }
  }
  
  public static final class j
    extends e
  {
    public String groupId = "";
    public int mXM = -1;
    public int rph = 0;
    public long rpi = 0L;
    public int xnT = 0;
    
    public j()
    {
      this.aCY = -1;
    }
    
    public final void a(b paramb)
    {
      if (!this.groupId.equals("")) {
        paramb.e(1, this.groupId);
      }
      if (this.rph != 0) {
        paramb.ao(2, this.rph);
      }
      if (this.rpi != 0L) {
        paramb.g(3, this.rpi);
      }
      if (this.mXM != -1) {
        paramb.ao(4, this.mXM);
      }
      if (this.xnT != 0) {
        paramb.ap(5, this.xnT);
      }
      super.a(paramb);
    }
    
    protected final int nz()
    {
      int j = super.nz();
      int i = j;
      if (!this.groupId.equals("")) {
        i = j + b.f(1, this.groupId);
      }
      j = i;
      if (this.rph != 0) {
        j = i + b.aq(2, this.rph);
      }
      i = j;
      if (this.rpi != 0L) {
        i = j + b.i(3, this.rpi);
      }
      j = i;
      if (this.mXM != -1) {
        j = i + b.aq(4, this.mXM);
      }
      i = j;
      if (this.xnT != 0) {
        i = j + b.ar(5, this.xnT);
      }
      return i;
    }
  }
  
  public static final class k
    extends e
  {
    public String groupId = "";
    public int hSL = 0;
    public int mXM = -1;
    public int rph = 0;
    public long rpi = 0L;
    public int xoe = 0;
    public byte[] xof = g.aDf;
    public a.aw[] xog = a.aw.cjN();
    public a.al[] xoh = a.al.cjI();
    public int xoi = 0;
    public int xoj = 0;
    
    public k()
    {
      this.aCY = -1;
    }
    
    public final void a(b paramb)
    {
      int j = 0;
      if (!this.groupId.equals("")) {
        paramb.e(1, this.groupId);
      }
      if (this.rph != 0) {
        paramb.ao(2, this.rph);
      }
      if (this.rpi != 0L) {
        paramb.g(3, this.rpi);
      }
      if (this.mXM != -1) {
        paramb.ao(4, this.mXM);
      }
      if (this.xoe != 0) {
        paramb.ao(5, this.xoe);
      }
      if (!Arrays.equals(this.xof, g.aDf)) {
        paramb.a(6, this.xof);
      }
      int i;
      Object localObject;
      if ((this.xog != null) && (this.xog.length > 0))
      {
        i = 0;
        while (i < this.xog.length)
        {
          localObject = this.xog[i];
          if (localObject != null) {
            paramb.a(7, (e)localObject);
          }
          i += 1;
        }
      }
      if ((this.xoh != null) && (this.xoh.length > 0))
      {
        i = j;
        while (i < this.xoh.length)
        {
          localObject = this.xoh[i];
          if (localObject != null) {
            paramb.a(8, (e)localObject);
          }
          i += 1;
        }
      }
      if (this.xoi != 0) {
        paramb.ao(9, this.xoi);
      }
      if (this.xoj != 0) {
        paramb.ao(10, this.xoj);
      }
      if (this.hSL != 0) {
        paramb.ao(11, this.hSL);
      }
      super.a(paramb);
    }
    
    protected final int nz()
    {
      int m = 0;
      int j = super.nz();
      int i = j;
      if (!this.groupId.equals("")) {
        i = j + b.f(1, this.groupId);
      }
      j = i;
      if (this.rph != 0) {
        j = i + b.aq(2, this.rph);
      }
      i = j;
      if (this.rpi != 0L) {
        i = j + b.i(3, this.rpi);
      }
      j = i;
      if (this.mXM != -1) {
        j = i + b.aq(4, this.mXM);
      }
      i = j;
      if (this.xoe != 0) {
        i = j + b.aq(5, this.xoe);
      }
      j = i;
      if (!Arrays.equals(this.xof, g.aDf)) {
        j = i + b.b(6, this.xof);
      }
      i = j;
      Object localObject;
      int k;
      if (this.xog != null)
      {
        i = j;
        if (this.xog.length > 0)
        {
          i = j;
          j = 0;
          while (j < this.xog.length)
          {
            localObject = this.xog[j];
            k = i;
            if (localObject != null) {
              k = i + b.b(7, (e)localObject);
            }
            j += 1;
            i = k;
          }
        }
      }
      j = i;
      if (this.xoh != null)
      {
        j = i;
        if (this.xoh.length > 0)
        {
          k = m;
          for (;;)
          {
            j = i;
            if (k >= this.xoh.length) {
              break;
            }
            localObject = this.xoh[k];
            j = i;
            if (localObject != null) {
              j = i + b.b(8, (e)localObject);
            }
            k += 1;
            i = j;
          }
        }
      }
      i = j;
      if (this.xoi != 0) {
        i = j + b.aq(9, this.xoi);
      }
      j = i;
      if (this.xoj != 0) {
        j = i + b.aq(10, this.xoj);
      }
      i = j;
      if (this.hSL != 0) {
        i = j + b.aq(11, this.hSL);
      }
      return i;
    }
  }
  
  public static final class l
    extends e
  {
    private static volatile l[] xok;
    public String fvS = "";
    public int trb = 0;
    public String xol = "";
    
    public l()
    {
      this.aCY = -1;
    }
    
    public static l[] cjD()
    {
      if (xok == null) {}
      synchronized (c.aCX)
      {
        if (xok == null) {
          xok = new l[0];
        }
        return xok;
      }
    }
    
    public final void a(b paramb)
    {
      if (this.trb != 0) {
        paramb.ap(1, this.trb);
      }
      if (!this.fvS.equals("")) {
        paramb.e(2, this.fvS);
      }
      if (!this.xol.equals("")) {
        paramb.e(3, this.xol);
      }
      super.a(paramb);
    }
    
    protected final int nz()
    {
      int j = super.nz();
      int i = j;
      if (this.trb != 0) {
        i = j + b.ar(1, this.trb);
      }
      j = i;
      if (!this.fvS.equals("")) {
        j = i + b.f(2, this.fvS);
      }
      i = j;
      if (!this.xol.equals("")) {
        i = j + b.f(3, this.xol);
      }
      return i;
    }
  }
  
  public static final class m
    extends e
  {
    private static volatile m[] xom;
    public byte[] fEC = g.aDf;
    public int xon = 0;
    public int xoo = 0;
    
    public m()
    {
      this.aCY = -1;
    }
    
    public static m[] cjE()
    {
      if (xom == null) {}
      synchronized (c.aCX)
      {
        if (xom == null) {
          xom = new m[0];
        }
        return xom;
      }
    }
    
    public final void a(b paramb)
    {
      if (this.xon != 0) {
        paramb.ao(1, this.xon);
      }
      if (!Arrays.equals(this.fEC, g.aDf)) {
        paramb.a(2, this.fEC);
      }
      if (this.xoo != 0) {
        paramb.ap(3, this.xoo);
      }
      super.a(paramb);
    }
    
    protected final int nz()
    {
      int j = super.nz();
      int i = j;
      if (this.xon != 0) {
        i = j + b.aq(1, this.xon);
      }
      j = i;
      if (!Arrays.equals(this.fEC, g.aDf)) {
        j = i + b.b(2, this.fEC);
      }
      i = j;
      if (this.xoo != 0) {
        i = j + b.ar(3, this.xoo);
      }
      return i;
    }
  }
  
  public static final class n
    extends e
  {
    private static volatile n[] xop;
    public int port = 0;
    public int xoq = 0;
    
    public n()
    {
      this.aCY = -1;
    }
    
    public static n[] cjF()
    {
      if (xop == null) {}
      synchronized (c.aCX)
      {
        if (xop == null) {
          xop = new n[0];
        }
        return xop;
      }
    }
    
    public final void a(b paramb)
    {
      if (this.xoq != 0) {
        paramb.ap(1, this.xoq);
      }
      if (this.port != 0) {
        paramb.ao(2, this.port);
      }
      super.a(paramb);
    }
    
    protected final int nz()
    {
      int j = super.nz();
      int i = j;
      if (this.xoq != 0) {
        i = j + b.ar(1, this.xoq);
      }
      j = i;
      if (this.port != 0) {
        j = i + b.aq(2, this.port);
      }
      return j;
    }
  }
  
  public static final class o
    extends e
  {
    public long fxK = 0L;
    public String groupId = "";
    public int rph = 0;
    public long rpi = 0L;
    public a.aq xnP = null;
    public int xnS = 0;
    public a.av xnU = null;
    public int xor = 0;
    public a.at[] xos = a.at.cjM();
    public a.as[] xot = a.as.cjL();
    public a.ap xou = null;
    public int xov = 0;
    public byte[] xow = g.aDf;
    public byte[] xox = g.aDf;
    public a.as[] xoy = a.as.cjL();
    
    public o()
    {
      this.aCY = -1;
    }
    
    public final void a(b paramb)
    {
      int j = 0;
      if (this.xor != 0) {
        paramb.ao(1, this.xor);
      }
      if (!this.groupId.equals("")) {
        paramb.e(2, this.groupId);
      }
      if (this.rph != 0) {
        paramb.ao(3, this.rph);
      }
      if (this.rpi != 0L) {
        paramb.g(4, this.rpi);
      }
      if (this.xnS != 0) {
        paramb.ap(5, this.xnS);
      }
      if (this.xnP != null) {
        paramb.a(6, this.xnP);
      }
      int i;
      Object localObject;
      if ((this.xos != null) && (this.xos.length > 0))
      {
        i = 0;
        while (i < this.xos.length)
        {
          localObject = this.xos[i];
          if (localObject != null) {
            paramb.a(7, (e)localObject);
          }
          i += 1;
        }
      }
      if ((this.xot != null) && (this.xot.length > 0))
      {
        i = 0;
        while (i < this.xot.length)
        {
          localObject = this.xot[i];
          if (localObject != null) {
            paramb.a(8, (e)localObject);
          }
          i += 1;
        }
      }
      if (this.xou != null) {
        paramb.a(9, this.xou);
      }
      if (this.xnU != null) {
        paramb.a(10, this.xnU);
      }
      if (this.fxK != 0L) {
        paramb.f(101, this.fxK);
      }
      if (this.xov != 0) {
        paramb.ap(102, this.xov);
      }
      if (!Arrays.equals(this.xow, g.aDf)) {
        paramb.a(103, this.xow);
      }
      if (!Arrays.equals(this.xox, g.aDf)) {
        paramb.a(200, this.xox);
      }
      if ((this.xoy != null) && (this.xoy.length > 0))
      {
        i = j;
        while (i < this.xoy.length)
        {
          localObject = this.xoy[i];
          if (localObject != null) {
            paramb.a(201, (e)localObject);
          }
          i += 1;
        }
      }
      super.a(paramb);
    }
    
    protected final int nz()
    {
      int m = 0;
      int j = super.nz();
      int i = j;
      if (this.xor != 0) {
        i = j + b.aq(1, this.xor);
      }
      j = i;
      if (!this.groupId.equals("")) {
        j = i + b.f(2, this.groupId);
      }
      i = j;
      if (this.rph != 0) {
        i = j + b.aq(3, this.rph);
      }
      j = i;
      if (this.rpi != 0L) {
        j = i + b.i(4, this.rpi);
      }
      int k = j;
      if (this.xnS != 0) {
        k = j + b.ar(5, this.xnS);
      }
      i = k;
      if (this.xnP != null) {
        i = k + b.b(6, this.xnP);
      }
      j = i;
      Object localObject;
      if (this.xos != null)
      {
        j = i;
        if (this.xos.length > 0)
        {
          j = 0;
          while (j < this.xos.length)
          {
            localObject = this.xos[j];
            k = i;
            if (localObject != null) {
              k = i + b.b(7, (e)localObject);
            }
            j += 1;
            i = k;
          }
          j = i;
        }
      }
      i = j;
      if (this.xot != null)
      {
        i = j;
        if (this.xot.length > 0)
        {
          i = j;
          j = 0;
          while (j < this.xot.length)
          {
            localObject = this.xot[j];
            k = i;
            if (localObject != null) {
              k = i + b.b(8, (e)localObject);
            }
            j += 1;
            i = k;
          }
        }
      }
      j = i;
      if (this.xou != null) {
        j = i + b.b(9, this.xou);
      }
      i = j;
      if (this.xnU != null) {
        i = j + b.b(10, this.xnU);
      }
      j = i;
      if (this.fxK != 0L) {
        j = i + b.h(101, this.fxK);
      }
      i = j;
      if (this.xov != 0) {
        i = j + b.ar(102, this.xov);
      }
      j = i;
      if (!Arrays.equals(this.xow, g.aDf)) {
        j = i + b.b(103, this.xow);
      }
      i = j;
      if (!Arrays.equals(this.xox, g.aDf)) {
        i = j + b.b(200, this.xox);
      }
      k = i;
      if (this.xoy != null)
      {
        k = i;
        if (this.xoy.length > 0)
        {
          j = m;
          for (;;)
          {
            k = i;
            if (j >= this.xoy.length) {
              break;
            }
            localObject = this.xoy[j];
            k = i;
            if (localObject != null) {
              k = i + b.b(201, (e)localObject);
            }
            j += 1;
            i = k;
          }
        }
      }
      return k;
    }
  }
  
  public static final class p
    extends e
  {
    public a.aj[] xoz = a.aj.cjH();
    
    public p()
    {
      this.aCY = -1;
    }
    
    public final void a(b paramb)
    {
      if ((this.xoz != null) && (this.xoz.length > 0))
      {
        int i = 0;
        while (i < this.xoz.length)
        {
          a.aj localaj = this.xoz[i];
          if (localaj != null) {
            paramb.a(1, localaj);
          }
          i += 1;
        }
      }
      super.a(paramb);
    }
    
    protected final int nz()
    {
      int i = super.nz();
      int k = i;
      if (this.xoz != null)
      {
        k = i;
        if (this.xoz.length > 0)
        {
          int j = 0;
          for (;;)
          {
            k = i;
            if (j >= this.xoz.length) {
              break;
            }
            a.aj localaj = this.xoz[j];
            k = i;
            if (localaj != null) {
              k = i + b.b(1, localaj);
            }
            j += 1;
            i = k;
          }
        }
      }
      return k;
    }
  }
  
  public static final class q
    extends e
  {
    public long tBw = 0L;
    public long tBx = 0L;
    public String uOf = "";
    public String username = "";
    public String xoA = "";
    public String xoB = "";
    public int xoC = 1;
    public String xoD = "";
    public long xoE = 0L;
    public int xoF = 0;
    public long xoG = 0L;
    public int xoH = 0;
    public String xol = "";
    
    public q()
    {
      this.aCY = -1;
    }
    
    public final void a(b paramb)
    {
      if (this.tBw != 0L) {
        paramb.f(1, this.tBw);
      }
      if (!this.xoA.equals("")) {
        paramb.e(2, this.xoA);
      }
      if (!this.xoB.equals("")) {
        paramb.e(3, this.xoB);
      }
      if (this.xoC != 1) {
        paramb.ao(4, this.xoC);
      }
      if (!this.username.equals("")) {
        paramb.e(5, this.username);
      }
      if (!this.xoD.equals("")) {
        paramb.e(6, this.xoD);
      }
      if (!this.xol.equals("")) {
        paramb.e(7, this.xol);
      }
      if (this.xoE != 0L) {
        paramb.f(8, this.xoE);
      }
      if (this.xoF != 0) {
        paramb.ap(9, this.xoF);
      }
      if (!this.uOf.equals("")) {
        paramb.e(10, this.uOf);
      }
      if (this.xoG != 0L) {
        paramb.f(11, this.xoG);
      }
      if (this.xoH != 0) {
        paramb.ap(12, this.xoH);
      }
      if (this.tBx != 0L) {
        paramb.f(13, this.tBx);
      }
      super.a(paramb);
    }
    
    protected final int nz()
    {
      int j = super.nz();
      int i = j;
      if (this.tBw != 0L) {
        i = j + b.h(1, this.tBw);
      }
      j = i;
      if (!this.xoA.equals("")) {
        j = i + b.f(2, this.xoA);
      }
      i = j;
      if (!this.xoB.equals("")) {
        i = j + b.f(3, this.xoB);
      }
      j = i;
      if (this.xoC != 1) {
        j = i + b.aq(4, this.xoC);
      }
      i = j;
      if (!this.username.equals("")) {
        i = j + b.f(5, this.username);
      }
      j = i;
      if (!this.xoD.equals("")) {
        j = i + b.f(6, this.xoD);
      }
      i = j;
      if (!this.xol.equals("")) {
        i = j + b.f(7, this.xol);
      }
      j = i;
      if (this.xoE != 0L) {
        j = i + b.h(8, this.xoE);
      }
      i = j;
      if (this.xoF != 0) {
        i = j + b.ar(9, this.xoF);
      }
      j = i;
      if (!this.uOf.equals("")) {
        j = i + b.f(10, this.uOf);
      }
      i = j;
      if (this.xoG != 0L) {
        i = j + b.h(11, this.xoG);
      }
      j = i;
      if (this.xoH != 0) {
        j = i + b.ar(12, this.xoH);
      }
      i = j;
      if (this.tBx != 0L) {
        i = j + b.h(13, this.tBx);
      }
      return i;
    }
  }
  
  public static final class r
    extends e
  {
    public byte[] data = g.aDf;
    public String iconUrl = "";
    public String lpQ = "";
    public int status = 0;
    public int xoI = 0;
    public byte[] xoJ = g.aDf;
    public byte[] xoK = g.aDf;
    public byte[] xoL = g.aDf;
    public int xoM = 0;
    public int xoN = 0;
    public byte[] xoO = g.aDf;
    public byte[] xoP = g.aDf;
    public byte[] xoQ = g.aDf;
    public byte[] xoR = g.aDf;
    public byte[] xoS = g.aDf;
    public byte[] xoT = g.aDf;
    public byte[] xoU = g.aDf;
    public byte[] xoV = g.aDf;
    public byte[] xoW = g.aDf;
    public byte[] xoX = g.aDf;
    
    public r()
    {
      this.aCY = -1;
    }
    
    public final void a(b paramb)
    {
      if (this.xoI != 0) {
        paramb.ap(1, this.xoI);
      }
      if (!Arrays.equals(this.xoJ, g.aDf)) {
        paramb.a(2, this.xoJ);
      }
      if (!this.iconUrl.equals("")) {
        paramb.e(3, this.iconUrl);
      }
      if (!Arrays.equals(this.xoK, g.aDf)) {
        paramb.a(4, this.xoK);
      }
      if (!Arrays.equals(this.xoL, g.aDf)) {
        paramb.a(5, this.xoL);
      }
      if (this.xoM != 0) {
        paramb.ap(6, this.xoM);
      }
      if (!Arrays.equals(this.data, g.aDf)) {
        paramb.a(7, this.data);
      }
      if (this.xoN != 0) {
        paramb.ap(8, this.xoN);
      }
      if (!Arrays.equals(this.xoO, g.aDf)) {
        paramb.a(9, this.xoO);
      }
      if (!this.lpQ.equals("")) {
        paramb.e(10, this.lpQ);
      }
      if (!Arrays.equals(this.xoP, g.aDf)) {
        paramb.a(11, this.xoP);
      }
      if (!Arrays.equals(this.xoQ, g.aDf)) {
        paramb.a(12, this.xoQ);
      }
      if (!Arrays.equals(this.xoR, g.aDf)) {
        paramb.a(13, this.xoR);
      }
      if (!Arrays.equals(this.xoS, g.aDf)) {
        paramb.a(14, this.xoS);
      }
      if (!Arrays.equals(this.xoT, g.aDf)) {
        paramb.a(15, this.xoT);
      }
      if (!Arrays.equals(this.xoU, g.aDf)) {
        paramb.a(16, this.xoU);
      }
      if (!Arrays.equals(this.xoV, g.aDf)) {
        paramb.a(17, this.xoV);
      }
      if (!Arrays.equals(this.xoW, g.aDf)) {
        paramb.a(18, this.xoW);
      }
      if (!Arrays.equals(this.xoX, g.aDf)) {
        paramb.a(19, this.xoX);
      }
      if (this.status != 0) {
        paramb.ap(20, this.status);
      }
      super.a(paramb);
    }
    
    protected final int nz()
    {
      int j = super.nz();
      int i = j;
      if (this.xoI != 0) {
        i = j + b.ar(1, this.xoI);
      }
      j = i;
      if (!Arrays.equals(this.xoJ, g.aDf)) {
        j = i + b.b(2, this.xoJ);
      }
      i = j;
      if (!this.iconUrl.equals("")) {
        i = j + b.f(3, this.iconUrl);
      }
      j = i;
      if (!Arrays.equals(this.xoK, g.aDf)) {
        j = i + b.b(4, this.xoK);
      }
      i = j;
      if (!Arrays.equals(this.xoL, g.aDf)) {
        i = j + b.b(5, this.xoL);
      }
      j = i;
      if (this.xoM != 0) {
        j = i + b.ar(6, this.xoM);
      }
      i = j;
      if (!Arrays.equals(this.data, g.aDf)) {
        i = j + b.b(7, this.data);
      }
      j = i;
      if (this.xoN != 0) {
        j = i + b.ar(8, this.xoN);
      }
      i = j;
      if (!Arrays.equals(this.xoO, g.aDf)) {
        i = j + b.b(9, this.xoO);
      }
      j = i;
      if (!this.lpQ.equals("")) {
        j = i + b.f(10, this.lpQ);
      }
      i = j;
      if (!Arrays.equals(this.xoP, g.aDf)) {
        i = j + b.b(11, this.xoP);
      }
      j = i;
      if (!Arrays.equals(this.xoQ, g.aDf)) {
        j = i + b.b(12, this.xoQ);
      }
      i = j;
      if (!Arrays.equals(this.xoR, g.aDf)) {
        i = j + b.b(13, this.xoR);
      }
      j = i;
      if (!Arrays.equals(this.xoS, g.aDf)) {
        j = i + b.b(14, this.xoS);
      }
      i = j;
      if (!Arrays.equals(this.xoT, g.aDf)) {
        i = j + b.b(15, this.xoT);
      }
      j = i;
      if (!Arrays.equals(this.xoU, g.aDf)) {
        j = i + b.b(16, this.xoU);
      }
      i = j;
      if (!Arrays.equals(this.xoV, g.aDf)) {
        i = j + b.b(17, this.xoV);
      }
      j = i;
      if (!Arrays.equals(this.xoW, g.aDf)) {
        j = i + b.b(18, this.xoW);
      }
      i = j;
      if (!Arrays.equals(this.xoX, g.aDf)) {
        i = j + b.b(19, this.xoX);
      }
      j = i;
      if (this.status != 0) {
        j = i + b.ar(20, this.status);
      }
      return j;
    }
  }
  
  public static final class s
    extends e
  {
    public int nN = 0;
    public int ret = 0;
    public int trb = 0;
    public String userName = "";
    public int xnS = 0;
    public int xoY = 0;
    public int xoZ = 0;
    
    public s()
    {
      this.aCY = -1;
    }
    
    public final void a(b paramb)
    {
      if (!this.userName.equals("")) {
        paramb.e(2, this.userName);
      }
      if (this.nN != 0) {
        paramb.ao(3, this.nN);
      }
      if (this.xoY != 0) {
        paramb.ap(4, this.xoY);
      }
      if (this.ret != 0) {
        paramb.ao(5, this.ret);
      }
      if (this.xoZ != 0) {
        paramb.ao(6, this.xoZ);
      }
      if (this.xnS != 0) {
        paramb.ap(7, this.xnS);
      }
      if (this.trb != 0) {
        paramb.ap(8, this.trb);
      }
      super.a(paramb);
    }
    
    protected final int nz()
    {
      int j = super.nz();
      int i = j;
      if (!this.userName.equals("")) {
        i = j + b.f(2, this.userName);
      }
      j = i;
      if (this.nN != 0) {
        j = i + b.aq(3, this.nN);
      }
      i = j;
      if (this.xoY != 0) {
        i = j + b.ar(4, this.xoY);
      }
      j = i;
      if (this.ret != 0) {
        j = i + b.aq(5, this.ret);
      }
      i = j;
      if (this.xoZ != 0) {
        i = j + b.aq(6, this.xoZ);
      }
      j = i;
      if (this.xnS != 0) {
        j = i + b.ar(7, this.xnS);
      }
      i = j;
      if (this.trb != 0) {
        i = j + b.ar(8, this.trb);
      }
      return i;
    }
  }
  
  public static final class t
    extends e
  {
    public byte[] body = g.aDf;
    public a.s xpa = null;
    
    public t()
    {
      this.aCY = -1;
    }
    
    public final void a(b paramb)
    {
      if (this.xpa != null) {
        paramb.a(1, this.xpa);
      }
      if (!Arrays.equals(this.body, g.aDf)) {
        paramb.a(2, this.body);
      }
      super.a(paramb);
    }
    
    protected final int nz()
    {
      int j = super.nz();
      int i = j;
      if (this.xpa != null) {
        i = j + b.b(1, this.xpa);
      }
      j = i;
      if (!Arrays.equals(this.body, g.aDf)) {
        j = i + b.b(2, this.body);
      }
      return j;
    }
  }
  
  public static final class u
    extends e
  {
    private static volatile u[] xpb;
    public String xpc = "";
    public String xpd = "";
    
    public u()
    {
      this.aCY = -1;
    }
    
    public static u[] cjG()
    {
      if (xpb == null) {}
      synchronized (c.aCX)
      {
        if (xpb == null) {
          xpb = new u[0];
        }
        return xpb;
      }
    }
    
    public final void a(b paramb)
    {
      if (!this.xpc.equals("")) {
        paramb.e(1, this.xpc);
      }
      if (!this.xpd.equals("")) {
        paramb.e(2, this.xpd);
      }
      super.a(paramb);
    }
    
    protected final int nz()
    {
      int j = super.nz();
      int i = j;
      if (!this.xpc.equals("")) {
        i = j + b.f(1, this.xpc);
      }
      j = i;
      if (!this.xpd.equals("")) {
        j = i + b.f(2, this.xpd);
      }
      return j;
    }
  }
  
  public static final class v
    extends e
  {
    public String groupId = "";
    public int rph = 0;
    public long rpi = 0L;
    public a.aq xnP = null;
    public a.as[] xpe = a.as.cjL();
    
    public v()
    {
      this.aCY = -1;
    }
    
    public final void a(b paramb)
    {
      if (!this.groupId.equals("")) {
        paramb.e(1, this.groupId);
      }
      if (this.rph != 0) {
        paramb.ao(2, this.rph);
      }
      if (this.rpi != 0L) {
        paramb.g(3, this.rpi);
      }
      if ((this.xpe != null) && (this.xpe.length > 0))
      {
        int i = 0;
        while (i < this.xpe.length)
        {
          a.as localas = this.xpe[i];
          if (localas != null) {
            paramb.a(4, localas);
          }
          i += 1;
        }
      }
      if (this.xnP != null) {
        paramb.a(5, this.xnP);
      }
      super.a(paramb);
    }
    
    protected final int nz()
    {
      int j = super.nz();
      int i = j;
      if (!this.groupId.equals("")) {
        i = j + b.f(1, this.groupId);
      }
      j = i;
      if (this.rph != 0) {
        j = i + b.aq(2, this.rph);
      }
      i = j;
      if (this.rpi != 0L) {
        i = j + b.i(3, this.rpi);
      }
      j = i;
      if (this.xpe != null)
      {
        j = i;
        if (this.xpe.length > 0)
        {
          j = 0;
          while (j < this.xpe.length)
          {
            a.as localas = this.xpe[j];
            int k = i;
            if (localas != null) {
              k = i + b.b(4, localas);
            }
            j += 1;
            i = k;
          }
          j = i;
        }
      }
      i = j;
      if (this.xnP != null) {
        i = j + b.b(5, this.xnP);
      }
      return i;
    }
  }
  
  public static final class w
    extends e
  {
    public String xnN = "";
    
    public w()
    {
      this.aCY = -1;
    }
    
    public final void a(b paramb)
    {
      if (!this.xnN.equals("")) {
        paramb.e(1, this.xnN);
      }
      super.a(paramb);
    }
    
    protected final int nz()
    {
      int j = super.nz();
      int i = j;
      if (!this.xnN.equals("")) {
        i = j + b.f(1, this.xnN);
      }
      return i;
    }
  }
  
  public static final class x
    extends e
  {
    public String groupId = "";
    public int rph = 0;
    public long rpi = 0L;
    public String xnN = "";
    public a.aq xnP = null;
    public int xnS = 0;
    public int xon = 0;
    public a.as[] xot = a.as.cjL();
    public a.ap xou = null;
    public a.as[] xoy = a.as.cjL();
    public a.n[] xpf = a.n.cjF();
    public a.at[] xpg = a.at.cjM();
    public int xph = 0;
    public int[] xpi = g.aCZ;
    public a.n[] xpj = a.n.cjF();
    public int xpk = 0;
    public int xpl = 0;
    public a.n[] xpm = a.n.cjF();
    public int xpn = 0;
    
    public x()
    {
      this.aCY = -1;
    }
    
    public final void a(b paramb)
    {
      int j = 0;
      if (!this.groupId.equals("")) {
        paramb.e(1, this.groupId);
      }
      if (this.rph != 0) {
        paramb.ao(2, this.rph);
      }
      if (this.rpi != 0L) {
        paramb.g(3, this.rpi);
      }
      if (this.xnS != 0) {
        paramb.ap(4, this.xnS);
      }
      int i;
      Object localObject;
      if ((this.xpf != null) && (this.xpf.length > 0))
      {
        i = 0;
        while (i < this.xpf.length)
        {
          localObject = this.xpf[i];
          if (localObject != null) {
            paramb.a(5, (e)localObject);
          }
          i += 1;
        }
      }
      if ((this.xpg != null) && (this.xpg.length > 0))
      {
        i = 0;
        while (i < this.xpg.length)
        {
          localObject = this.xpg[i];
          if (localObject != null) {
            paramb.a(6, (e)localObject);
          }
          i += 1;
        }
      }
      if (this.xou != null) {
        paramb.a(7, this.xou);
      }
      if (!this.xnN.equals("")) {
        paramb.e(8, this.xnN);
      }
      if ((this.xot != null) && (this.xot.length > 0))
      {
        i = 0;
        while (i < this.xot.length)
        {
          localObject = this.xot[i];
          if (localObject != null) {
            paramb.a(9, (e)localObject);
          }
          i += 1;
        }
      }
      if (this.xph != 0) {
        paramb.ao(10, this.xph);
      }
      if ((this.xpi != null) && (this.xpi.length > 0))
      {
        i = 0;
        while (i < this.xpi.length)
        {
          paramb.ao(11, this.xpi[i]);
          i += 1;
        }
      }
      if (this.xnP != null) {
        paramb.a(12, this.xnP);
      }
      if (this.xon != 0) {
        paramb.ap(13, this.xon);
      }
      if ((this.xpj != null) && (this.xpj.length > 0))
      {
        i = 0;
        while (i < this.xpj.length)
        {
          localObject = this.xpj[i];
          if (localObject != null) {
            paramb.a(14, (e)localObject);
          }
          i += 1;
        }
      }
      if (this.xpk != 0) {
        paramb.ap(15, this.xpk);
      }
      if (this.xpl != 0) {
        paramb.ap(16, this.xpl);
      }
      if ((this.xoy != null) && (this.xoy.length > 0))
      {
        i = 0;
        while (i < this.xoy.length)
        {
          localObject = this.xoy[i];
          if (localObject != null) {
            paramb.a(17, (e)localObject);
          }
          i += 1;
        }
      }
      if ((this.xpm != null) && (this.xpm.length > 0))
      {
        i = j;
        while (i < this.xpm.length)
        {
          localObject = this.xpm[i];
          if (localObject != null) {
            paramb.a(18, (e)localObject);
          }
          i += 1;
        }
      }
      if (this.xpn != 0) {
        paramb.ao(19, this.xpn);
      }
      super.a(paramb);
    }
    
    protected final int nz()
    {
      int m = 0;
      int j = super.nz();
      int i = j;
      if (!this.groupId.equals("")) {
        i = j + b.f(1, this.groupId);
      }
      j = i;
      if (this.rph != 0) {
        j = i + b.aq(2, this.rph);
      }
      int k = j;
      if (this.rpi != 0L) {
        k = j + b.i(3, this.rpi);
      }
      i = k;
      if (this.xnS != 0) {
        i = k + b.ar(4, this.xnS);
      }
      j = i;
      Object localObject;
      if (this.xpf != null)
      {
        j = i;
        if (this.xpf.length > 0)
        {
          j = 0;
          while (j < this.xpf.length)
          {
            localObject = this.xpf[j];
            k = i;
            if (localObject != null) {
              k = i + b.b(5, (e)localObject);
            }
            j += 1;
            i = k;
          }
          j = i;
        }
      }
      i = j;
      if (this.xpg != null)
      {
        i = j;
        if (this.xpg.length > 0)
        {
          i = j;
          j = 0;
          while (j < this.xpg.length)
          {
            localObject = this.xpg[j];
            k = i;
            if (localObject != null) {
              k = i + b.b(6, (e)localObject);
            }
            j += 1;
            i = k;
          }
        }
      }
      j = i;
      if (this.xou != null) {
        j = i + b.b(7, this.xou);
      }
      i = j;
      if (!this.xnN.equals("")) {
        i = j + b.f(8, this.xnN);
      }
      j = i;
      if (this.xot != null)
      {
        j = i;
        if (this.xot.length > 0)
        {
          j = 0;
          while (j < this.xot.length)
          {
            localObject = this.xot[j];
            k = i;
            if (localObject != null) {
              k = i + b.b(9, (e)localObject);
            }
            j += 1;
            i = k;
          }
          j = i;
        }
      }
      i = j;
      if (this.xph != 0) {
        i = j + b.aq(10, this.xph);
      }
      j = i;
      if (this.xpi != null)
      {
        j = i;
        if (this.xpi.length > 0)
        {
          j = 0;
          k = 0;
          while (j < this.xpi.length)
          {
            k += b.cI(this.xpi[j]);
            j += 1;
          }
          j = i + k + this.xpi.length * 1;
        }
      }
      k = j;
      if (this.xnP != null) {
        k = j + b.b(12, this.xnP);
      }
      i = k;
      if (this.xon != 0) {
        i = k + b.ar(13, this.xon);
      }
      j = i;
      if (this.xpj != null)
      {
        j = i;
        if (this.xpj.length > 0)
        {
          j = 0;
          while (j < this.xpj.length)
          {
            localObject = this.xpj[j];
            k = i;
            if (localObject != null) {
              k = i + b.b(14, (e)localObject);
            }
            j += 1;
            i = k;
          }
          j = i;
        }
      }
      i = j;
      if (this.xpk != 0) {
        i = j + b.ar(15, this.xpk);
      }
      j = i;
      if (this.xpl != 0) {
        j = i + b.ar(16, this.xpl);
      }
      i = j;
      if (this.xoy != null)
      {
        i = j;
        if (this.xoy.length > 0)
        {
          i = j;
          j = 0;
          while (j < this.xoy.length)
          {
            localObject = this.xoy[j];
            k = i;
            if (localObject != null) {
              k = i + b.b(17, (e)localObject);
            }
            j += 1;
            i = k;
          }
        }
      }
      j = i;
      if (this.xpm != null)
      {
        j = i;
        if (this.xpm.length > 0)
        {
          k = m;
          for (;;)
          {
            j = i;
            if (k >= this.xpm.length) {
              break;
            }
            localObject = this.xpm[k];
            j = i;
            if (localObject != null) {
              j = i + b.b(18, (e)localObject);
            }
            k += 1;
            i = j;
          }
        }
      }
      i = j;
      if (this.xpn != 0) {
        i = j + b.aq(19, this.xpn);
      }
      return i;
    }
  }
  
  public static final class y
    extends e
  {
    public String groupId = "";
    public int rph = 0;
    public long rpi = 0L;
    public a.aq xnP = null;
    public int xnZ = 0;
    public int xon = 0;
    public a.ap xou = null;
    public a.as[] xoy = a.as.cjL();
    public a.as[] xpe = a.as.cjL();
    public a.n[] xpf = a.n.cjF();
    public a.at[] xpg = a.at.cjM();
    public int xph = 0;
    public int[] xpi = g.aCZ;
    public a.n[] xpj = a.n.cjF();
    public int xpk = 0;
    public int xpl = 0;
    public a.n[] xpm = a.n.cjF();
    public int xpn = 0;
    
    public y()
    {
      this.aCY = -1;
    }
    
    public final void a(b paramb)
    {
      int j = 0;
      if (!this.groupId.equals("")) {
        paramb.e(1, this.groupId);
      }
      if (this.rph != 0) {
        paramb.ao(2, this.rph);
      }
      if (this.rpi != 0L) {
        paramb.g(3, this.rpi);
      }
      int i;
      Object localObject;
      if ((this.xpf != null) && (this.xpf.length > 0))
      {
        i = 0;
        while (i < this.xpf.length)
        {
          localObject = this.xpf[i];
          if (localObject != null) {
            paramb.a(4, (e)localObject);
          }
          i += 1;
        }
      }
      if ((this.xpe != null) && (this.xpe.length > 0))
      {
        i = 0;
        while (i < this.xpe.length)
        {
          localObject = this.xpe[i];
          if (localObject != null) {
            paramb.a(5, (e)localObject);
          }
          i += 1;
        }
      }
      if (this.xou != null) {
        paramb.a(6, this.xou);
      }
      if (this.xph != 0) {
        paramb.ao(7, this.xph);
      }
      if ((this.xpi != null) && (this.xpi.length > 0))
      {
        i = 0;
        while (i < this.xpi.length)
        {
          paramb.ao(8, this.xpi[i]);
          i += 1;
        }
      }
      if (this.xnZ != 0) {
        paramb.ao(9, this.xnZ);
      }
      if ((this.xpg != null) && (this.xpg.length > 0))
      {
        i = 0;
        while (i < this.xpg.length)
        {
          localObject = this.xpg[i];
          if (localObject != null) {
            paramb.a(10, (e)localObject);
          }
          i += 1;
        }
      }
      if (this.xnP != null) {
        paramb.a(11, this.xnP);
      }
      if (this.xon != 0) {
        paramb.ap(12, this.xon);
      }
      if ((this.xpj != null) && (this.xpj.length > 0))
      {
        i = 0;
        while (i < this.xpj.length)
        {
          localObject = this.xpj[i];
          if (localObject != null) {
            paramb.a(13, (e)localObject);
          }
          i += 1;
        }
      }
      if ((this.xpm != null) && (this.xpm.length > 0))
      {
        i = 0;
        while (i < this.xpm.length)
        {
          localObject = this.xpm[i];
          if (localObject != null) {
            paramb.a(14, (e)localObject);
          }
          i += 1;
        }
      }
      if (this.xpn != 0) {
        paramb.ao(15, this.xpn);
      }
      if (this.xpk != 0) {
        paramb.ap(100, this.xpk);
      }
      if (this.xpl != 0) {
        paramb.ap(101, this.xpl);
      }
      if ((this.xoy != null) && (this.xoy.length > 0))
      {
        i = j;
        while (i < this.xoy.length)
        {
          localObject = this.xoy[i];
          if (localObject != null) {
            paramb.a(102, (e)localObject);
          }
          i += 1;
        }
      }
      super.a(paramb);
    }
    
    protected final int nz()
    {
      int m = 0;
      int j = super.nz();
      int i = j;
      if (!this.groupId.equals("")) {
        i = j + b.f(1, this.groupId);
      }
      j = i;
      if (this.rph != 0) {
        j = i + b.aq(2, this.rph);
      }
      i = j;
      if (this.rpi != 0L) {
        i = j + b.i(3, this.rpi);
      }
      j = i;
      Object localObject;
      if (this.xpf != null)
      {
        j = i;
        if (this.xpf.length > 0)
        {
          j = 0;
          while (j < this.xpf.length)
          {
            localObject = this.xpf[j];
            k = i;
            if (localObject != null) {
              k = i + b.b(4, (e)localObject);
            }
            j += 1;
            i = k;
          }
          j = i;
        }
      }
      i = j;
      if (this.xpe != null)
      {
        i = j;
        if (this.xpe.length > 0)
        {
          i = j;
          j = 0;
          while (j < this.xpe.length)
          {
            localObject = this.xpe[j];
            k = i;
            if (localObject != null) {
              k = i + b.b(5, (e)localObject);
            }
            j += 1;
            i = k;
          }
        }
      }
      j = i;
      if (this.xou != null) {
        j = i + b.b(6, this.xou);
      }
      i = j;
      if (this.xph != 0) {
        i = j + b.aq(7, this.xph);
      }
      j = i;
      if (this.xpi != null)
      {
        j = i;
        if (this.xpi.length > 0)
        {
          j = 0;
          k = 0;
          while (j < this.xpi.length)
          {
            k += b.cI(this.xpi[j]);
            j += 1;
          }
          j = i + k + this.xpi.length * 1;
        }
      }
      i = j;
      if (this.xnZ != 0) {
        i = j + b.aq(9, this.xnZ);
      }
      j = i;
      if (this.xpg != null)
      {
        j = i;
        if (this.xpg.length > 0)
        {
          j = 0;
          while (j < this.xpg.length)
          {
            localObject = this.xpg[j];
            k = i;
            if (localObject != null) {
              k = i + b.b(10, (e)localObject);
            }
            j += 1;
            i = k;
          }
          j = i;
        }
      }
      int k = j;
      if (this.xnP != null) {
        k = j + b.b(11, this.xnP);
      }
      i = k;
      if (this.xon != 0) {
        i = k + b.ar(12, this.xon);
      }
      j = i;
      if (this.xpj != null)
      {
        j = i;
        if (this.xpj.length > 0)
        {
          j = 0;
          while (j < this.xpj.length)
          {
            localObject = this.xpj[j];
            k = i;
            if (localObject != null) {
              k = i + b.b(13, (e)localObject);
            }
            j += 1;
            i = k;
          }
          j = i;
        }
      }
      i = j;
      if (this.xpm != null)
      {
        i = j;
        if (this.xpm.length > 0)
        {
          i = j;
          j = 0;
          while (j < this.xpm.length)
          {
            localObject = this.xpm[j];
            k = i;
            if (localObject != null) {
              k = i + b.b(14, (e)localObject);
            }
            j += 1;
            i = k;
          }
        }
      }
      j = i;
      if (this.xpn != 0) {
        j = i + b.aq(15, this.xpn);
      }
      k = j;
      if (this.xpk != 0) {
        k = j + b.ar(100, this.xpk);
      }
      i = k;
      if (this.xpl != 0) {
        i = k + b.ar(101, this.xpl);
      }
      k = i;
      if (this.xoy != null)
      {
        k = i;
        if (this.xoy.length > 0)
        {
          j = m;
          for (;;)
          {
            k = i;
            if (j >= this.xoy.length) {
              break;
            }
            localObject = this.xoy[j];
            k = i;
            if (localObject != null) {
              k = i + b.b(102, (e)localObject);
            }
            j += 1;
            i = k;
          }
        }
      }
      return k;
    }
  }
  
  public static final class z
    extends e
  {
    public String groupId = "";
    public int rph = 0;
    public long rpi = 0L;
    
    public z()
    {
      this.aCY = -1;
    }
    
    public final void a(b paramb)
    {
      if (!this.groupId.equals("")) {
        paramb.e(1, this.groupId);
      }
      if (this.rph != 0) {
        paramb.ao(2, this.rph);
      }
      if (this.rpi != 0L) {
        paramb.g(3, this.rpi);
      }
      super.a(paramb);
    }
    
    protected final int nz()
    {
      int j = super.nz();
      int i = j;
      if (!this.groupId.equals("")) {
        i = j + b.f(1, this.groupId);
      }
      j = i;
      if (this.rph != 0) {
        j = i + b.aq(2, this.rph);
      }
      i = j;
      if (this.rpi != 0L) {
        i = j + b.i(3, this.rpi);
      }
      return i;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/pb/common/b/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */