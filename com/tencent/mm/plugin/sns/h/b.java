package com.tencent.mm.plugin.sns.h;

import android.os.Process;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.pp;
import com.tencent.mm.modelsns.d;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.plugin.sns.model.ai;
import com.tencent.mm.plugin.sns.storage.k;
import com.tencent.mm.plugin.sns.storage.l;
import com.tencent.mm.plugin.sns.storage.m;
import com.tencent.mm.protocal.c.bhc;
import com.tencent.mm.protocal.c.sn;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.o;
import java.util.HashSet;
import java.util.Iterator;

public final class b
{
  c gCa;
  int gCz;
  public int kkz;
  public boolean qiH;
  public long qiI;
  public long qiJ;
  public int qiK;
  int qiL;
  int qiM;
  int qiN;
  public int qiO;
  public int qiP;
  int qiQ;
  public int qiR;
  public int qiS;
  public int qiT;
  public int qiU;
  public int qiV;
  public String qiW;
  public String qiX;
  String qiY;
  int qiZ;
  long qjA;
  long qjB;
  long qjC;
  long qjD;
  long qjE;
  long qjF;
  long qjG;
  long qjH;
  long qjI;
  long qjJ;
  long qjK;
  long qjL;
  long qjM;
  long qjN;
  long qjO;
  long qjP;
  long qjQ;
  long qjR;
  long qjS;
  long qjT;
  long qjU;
  long qjV;
  String qjW;
  int qjX;
  long qjY;
  private long qjZ;
  public int qja;
  public int qjb;
  public int qjc;
  public int qjd;
  public int qje;
  public int qjf;
  public int qjg;
  public int qjh;
  int qji;
  int qjj;
  int qjk;
  int qjl;
  int qjm;
  int qjn;
  public int qjo;
  public int qjp;
  int qjq;
  int qjr;
  public long qjs;
  public long qjt;
  long qju;
  long qjv;
  long qjw;
  long qjx;
  long qjy;
  long qjz;
  public HashSet<String> qkA;
  public HashSet<String> qkB;
  public HashSet<String> qkC;
  public HashSet<String> qkD;
  public long qkE;
  long qka;
  private long qkb;
  private HashSet<String> qkc;
  HashSet<String> qkd;
  public HashSet<String> qke;
  HashSet<String> qkf;
  public HashSet<String> qkg;
  HashSet<String> qkh;
  HashSet<String> qki;
  public HashSet<String> qkj;
  public HashSet<String> qkk;
  HashSet<String> qkl;
  public HashSet<String> qkm;
  private HashSet<String> qkn;
  public HashSet<String> qko;
  public HashSet<String> qkp;
  public int qkq;
  public int qkr;
  public HashSet<String> qks;
  public HashSet<String> qkt;
  public HashSet<String> qku;
  public HashSet<String> qkv;
  public HashSet<String> qkw;
  public HashSet<String> qkx;
  public HashSet<String> qky;
  public HashSet<String> qkz;
  
  public b()
  {
    GMTrace.i(8885347811328L, 66201);
    this.qiH = false;
    this.qiI = -1L;
    this.qiJ = 0L;
    this.qiK = 0;
    this.qiL = 0;
    this.qiM = 0;
    this.qiN = 0;
    this.qiO = 0;
    this.qiP = 0;
    this.qiQ = 0;
    this.qiR = 0;
    this.qiS = 0;
    this.qiT = 0;
    this.qiU = 0;
    this.qiV = 0;
    this.qiW = "";
    this.qiX = "";
    this.qiY = "";
    this.qja = 0;
    this.qjb = 0;
    this.qjc = 0;
    this.qjd = 0;
    this.qje = 0;
    this.qjf = 0;
    this.qjg = 0;
    this.kkz = 0;
    this.qjh = 0;
    this.qji = 0;
    this.qjj = 0;
    this.qjk = 0;
    this.qjl = 0;
    this.qjm = 0;
    this.qjn = 0;
    this.qjo = 0;
    this.qjp = 0;
    this.qjq = 0;
    this.qjr = 0;
    this.qjs = 0L;
    this.qjt = 0L;
    this.qju = 0L;
    this.qjv = 0L;
    this.qjw = 0L;
    this.qjx = 0L;
    this.qjy = 0L;
    this.qjz = 0L;
    this.qjA = 0L;
    this.qjB = 0L;
    this.qjC = 0L;
    this.qjD = 0L;
    this.qjE = 0L;
    this.qjF = 0L;
    this.qjG = 0L;
    this.qjH = 0L;
    this.qjI = 0L;
    this.qjJ = 0L;
    this.qjK = 0L;
    this.qjL = 0L;
    this.qjM = 0L;
    this.qjN = 0L;
    this.qjO = 0L;
    this.qjP = 0L;
    this.qjQ = 0L;
    this.qjR = 0L;
    this.qjS = 0L;
    this.qjT = 0L;
    this.qjU = 0L;
    this.qjV = 0L;
    this.qjY = 0L;
    this.qjZ = 0L;
    this.qka = 0L;
    this.qkb = 0L;
    this.qkc = new HashSet();
    this.qkd = new HashSet();
    this.qke = new HashSet();
    this.qkf = new HashSet();
    this.qkg = new HashSet();
    this.qkh = new HashSet();
    this.qki = new HashSet();
    this.qkj = new HashSet();
    this.qkk = new HashSet();
    this.qkl = new HashSet();
    this.qkm = new HashSet();
    this.qkn = new HashSet();
    this.qko = new HashSet();
    this.qkp = new HashSet();
    this.qkq = Integer.MAX_VALUE;
    this.qkr = 0;
    this.qks = new HashSet();
    this.qkt = new HashSet();
    this.qku = new HashSet();
    this.qkv = new HashSet();
    this.qkw = new HashSet();
    this.qkx = new HashSet();
    this.qky = new HashSet();
    this.qkz = new HashSet();
    this.qkA = new HashSet();
    this.qkB = new HashSet();
    this.qkC = new HashSet();
    this.qkD = new HashSet();
    this.gCa = new c() {};
    this.qkE = 0L;
    a.uLm.b(this.gCa);
    GMTrace.o(8885347811328L, 66201);
  }
  
  public b(int paramInt1, String paramString, int paramInt2)
  {
    this();
    GMTrace.i(8885482029056L, 66202);
    this.gCz = paramInt1;
    this.qjW = paramString;
    this.qjX = paramInt2;
    GMTrace.o(8885482029056L, 66202);
  }
  
  static String e(HashSet<String> paramHashSet)
  {
    GMTrace.i(8885616246784L, 66203);
    StringBuffer localStringBuffer = new StringBuffer();
    paramHashSet = paramHashSet.iterator();
    int i = 1;
    while (paramHashSet.hasNext())
    {
      String str = (String)paramHashSet.next();
      if (i != 0)
      {
        localStringBuffer.append(str);
        i = 0;
      }
      else
      {
        localStringBuffer.append("|" + str);
      }
    }
    paramHashSet = localStringBuffer.toString();
    GMTrace.o(8885616246784L, 66203);
    return paramHashSet;
  }
  
  public final void a(m paramm, boolean paramBoolean)
  {
    GMTrace.i(8882931892224L, 66183);
    if (paramm == null)
    {
      GMTrace.o(8882931892224L, 66183);
      return;
    }
    if (paramBoolean) {
      this.qkh.add(i.g(paramm));
    }
    for (;;)
    {
      this.qkl.add(paramm.field_userName);
      this.qiN = this.qkl.size();
      if (!ae.bgV().equals(paramm.field_userName)) {
        break;
      }
      hD(true);
      GMTrace.o(8882931892224L, 66183);
      return;
      this.qki.add(i.g(paramm));
    }
    hE(true);
    GMTrace.o(8882931892224L, 66183);
  }
  
  public final void dy(String paramString1, String paramString2)
  {
    GMTrace.i(8883066109952L, 66184);
    this.qkf.add(paramString2);
    this.qkn.add(paramString1);
    this.qiQ = this.qkn.size();
    GMTrace.o(8883066109952L, 66184);
  }
  
  public final void hC(boolean paramBoolean)
  {
    GMTrace.i(8883200327680L, 66185);
    if (paramBoolean)
    {
      this.qjv = System.currentTimeMillis();
      GMTrace.o(8883200327680L, 66185);
      return;
    }
    if (this.qjv > 0L)
    {
      this.qju += System.currentTimeMillis() - this.qjv;
      this.qjv = 0L;
    }
    GMTrace.o(8883200327680L, 66185);
  }
  
  public final void hD(boolean paramBoolean)
  {
    GMTrace.i(8883334545408L, 66186);
    if (paramBoolean)
    {
      this.qjx = System.currentTimeMillis();
      GMTrace.o(8883334545408L, 66186);
      return;
    }
    if (this.qjx > 0L)
    {
      this.qjw += System.currentTimeMillis() - this.qjx;
      this.qjx = 0L;
    }
    GMTrace.o(8883334545408L, 66186);
  }
  
  public final void hE(boolean paramBoolean)
  {
    GMTrace.i(8883468763136L, 66187);
    if (paramBoolean)
    {
      this.qjz = System.currentTimeMillis();
      GMTrace.o(8883468763136L, 66187);
      return;
    }
    if (this.qjz > 0L)
    {
      this.qjy += System.currentTimeMillis() - this.qjz;
      this.qjz = 0L;
    }
    GMTrace.o(8883468763136L, 66187);
  }
  
  public final void hF(boolean paramBoolean)
  {
    GMTrace.i(8883602980864L, 66188);
    if (paramBoolean)
    {
      this.qjB = System.currentTimeMillis();
      GMTrace.o(8883602980864L, 66188);
      return;
    }
    if (this.qjB > 0L)
    {
      this.qjA += System.currentTimeMillis() - this.qjB;
      this.qjB = 0L;
    }
    GMTrace.o(8883602980864L, 66188);
  }
  
  public final void hG(boolean paramBoolean)
  {
    GMTrace.i(8883737198592L, 66189);
    if (paramBoolean)
    {
      this.qjD = System.currentTimeMillis();
      GMTrace.o(8883737198592L, 66189);
      return;
    }
    if (this.qjD > 0L)
    {
      this.qjC += System.currentTimeMillis() - this.qjD;
      this.qjD = 0L;
    }
    GMTrace.o(8883737198592L, 66189);
  }
  
  public final void hH(boolean paramBoolean)
  {
    GMTrace.i(8883871416320L, 66190);
    if (paramBoolean)
    {
      this.qjF = System.currentTimeMillis();
      GMTrace.o(8883871416320L, 66190);
      return;
    }
    if (this.qjF > 0L)
    {
      this.qjE += System.currentTimeMillis() - this.qjF;
      this.qjF = 0L;
    }
    GMTrace.o(8883871416320L, 66190);
  }
  
  public final void hI(boolean paramBoolean)
  {
    GMTrace.i(8884005634048L, 66191);
    if (paramBoolean)
    {
      this.qjZ = System.currentTimeMillis();
      GMTrace.o(8884005634048L, 66191);
      return;
    }
    if (this.qjZ > 0L)
    {
      this.qjY += System.currentTimeMillis() - this.qjZ;
      this.qjZ = 0L;
    }
    GMTrace.o(8884005634048L, 66191);
  }
  
  public final void hJ(boolean paramBoolean)
  {
    GMTrace.i(8884139851776L, 66192);
    if (paramBoolean)
    {
      this.qkb = System.currentTimeMillis();
      GMTrace.o(8884139851776L, 66192);
      return;
    }
    if (this.qkb > 0L)
    {
      this.qka += System.currentTimeMillis() - this.qkb;
      this.qkb = 0L;
    }
    GMTrace.o(8884139851776L, 66192);
  }
  
  public final void hK(boolean paramBoolean)
  {
    GMTrace.i(8884274069504L, 66193);
    if (paramBoolean)
    {
      this.qjH = System.currentTimeMillis();
      GMTrace.o(8884274069504L, 66193);
      return;
    }
    if (this.qjH > 0L)
    {
      this.qjG += System.currentTimeMillis() - this.qjH;
      this.qjH = 0L;
    }
    GMTrace.o(8884274069504L, 66193);
  }
  
  public final void hL(boolean paramBoolean)
  {
    GMTrace.i(8884408287232L, 66194);
    if (paramBoolean)
    {
      this.qjJ = System.currentTimeMillis();
      GMTrace.o(8884408287232L, 66194);
      return;
    }
    if (this.qjJ > 0L)
    {
      this.qjI += System.currentTimeMillis() - this.qjJ;
      this.qjJ = 0L;
    }
    GMTrace.o(8884408287232L, 66194);
  }
  
  public final void hM(boolean paramBoolean)
  {
    GMTrace.i(8884542504960L, 66195);
    if (paramBoolean)
    {
      this.qjL = System.currentTimeMillis();
      GMTrace.o(8884542504960L, 66195);
      return;
    }
    if (this.qjL > 0L)
    {
      this.qjK += System.currentTimeMillis() - this.qjL;
      this.qjL = 0L;
    }
    GMTrace.o(8884542504960L, 66195);
  }
  
  public final void hN(boolean paramBoolean)
  {
    GMTrace.i(8884676722688L, 66196);
    if (paramBoolean)
    {
      this.qjN = System.currentTimeMillis();
      GMTrace.o(8884676722688L, 66196);
      return;
    }
    if (this.qjN > 0L)
    {
      this.qjM += System.currentTimeMillis() - this.qjN;
      this.qjN = 0L;
    }
    GMTrace.o(8884676722688L, 66196);
  }
  
  public final void hO(boolean paramBoolean)
  {
    GMTrace.i(8884810940416L, 66197);
    if (paramBoolean)
    {
      this.qjR = System.currentTimeMillis();
      GMTrace.o(8884810940416L, 66197);
      return;
    }
    if (this.qjR > 0L)
    {
      this.qjQ += System.currentTimeMillis() - this.qjR;
      this.qjR = 0L;
    }
    GMTrace.o(8884810940416L, 66197);
  }
  
  public final void hP(boolean paramBoolean)
  {
    GMTrace.i(8884945158144L, 66198);
    if (paramBoolean)
    {
      this.qjT = System.currentTimeMillis();
      GMTrace.o(8884945158144L, 66198);
      return;
    }
    if (this.qjT > 0L)
    {
      this.qjS += System.currentTimeMillis() - this.qjT;
      this.qjT = 0L;
    }
    GMTrace.o(8884945158144L, 66198);
  }
  
  public final void hQ(boolean paramBoolean)
  {
    GMTrace.i(8885079375872L, 66199);
    if (paramBoolean)
    {
      this.qjV = System.currentTimeMillis();
      GMTrace.o(8885079375872L, 66199);
      return;
    }
    if (this.qjV > 0L)
    {
      this.qjU += System.currentTimeMillis() - this.qjV;
      this.qjV = 0L;
    }
    GMTrace.o(8885079375872L, 66199);
  }
  
  public final void hR(boolean paramBoolean)
  {
    GMTrace.i(8885213593600L, 66200);
    if (paramBoolean) {}
    for (int i = 1;; i = 0)
    {
      this.qiZ = i;
      GMTrace.o(8885213593600L, 66200);
      return;
    }
  }
  
  public final void u(m paramm)
  {
    GMTrace.i(8882663456768L, 66181);
    if (paramm == null)
    {
      GMTrace.o(8882663456768L, 66181);
      return;
    }
    this.qkc.add(paramm.bkg());
    this.qiL = this.qkc.size();
    GMTrace.o(8882663456768L, 66181);
  }
  
  public final void v(m paramm)
  {
    GMTrace.i(8882797674496L, 66182);
    if (paramm == null)
    {
      GMTrace.o(8882797674496L, 66182);
      return;
    }
    String str1 = paramm.bkg();
    String str2 = i.g(paramm);
    if (this.qkd.contains(str2))
    {
      GMTrace.o(8882797674496L, 66182);
      return;
    }
    w.i("MicroMsg.SnsBrowseInfoHelper", "onClickFeed localId:Td, snsId:%s", new Object[] { str1, str2 });
    this.qiM += 1;
    this.qkd.add(str2);
    if (paramm.uF(32)) {
      this.qjr += 1;
    }
    switch (paramm.field_type)
    {
    }
    while (paramm.uF(32)) {
      if ((paramm.bjH() != null) && (paramm.bjH().qln))
      {
        hI(true);
        GMTrace.o(8882797674496L, 66182);
        return;
        this.qjk += 1;
        continue;
        this.qjm += 1;
        continue;
        this.qjl += 1;
        continue;
        this.qjn += 1;
        continue;
        this.qjq += 1;
        continue;
        if (!bg.mZ(paramm.bjL().uyv)) {
          this.qji += 1;
        } else {
          this.qjj += 1;
        }
      }
      else
      {
        if (paramm.field_type == 1)
        {
          hN(true);
          GMTrace.o(8882797674496L, 66182);
          return;
        }
        if (paramm.field_type != 15) {
          break label464;
        }
        hO(true);
        GMTrace.o(8882797674496L, 66182);
        return;
      }
    }
    if ((paramm.bjL() != null) && (!bg.mZ(paramm.bjL().qAC)))
    {
      hJ(true);
      GMTrace.o(8882797674496L, 66182);
      return;
    }
    switch (paramm.field_type)
    {
    }
    for (;;)
    {
      label464:
      GMTrace.o(8882797674496L, 66182);
      return;
      hH(true);
      GMTrace.o(8882797674496L, 66182);
      return;
      hM(true);
      GMTrace.o(8882797674496L, 66182);
      return;
      hK(true);
      GMTrace.o(8882797674496L, 66182);
      return;
      hM(true);
      GMTrace.o(8882797674496L, 66182);
      return;
      hQ(true);
      GMTrace.o(8882797674496L, 66182);
      return;
      if (!bg.mZ(paramm.bjL().uyv))
      {
        hL(true);
        GMTrace.o(8882797674496L, 66182);
        return;
      }
      hM(true);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/h/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */