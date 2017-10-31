package com.tencent.mm.plugin.freewifi.d;

import android.os.Build;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.protocal.c.amc;
import com.tencent.mm.protocal.c.amd;
import com.tencent.mm.protocal.c.ame;
import java.util.LinkedList;

public final class j
  extends c
{
  public j(LinkedList<ame> paramLinkedList, int paramInt)
  {
    GMTrace.i(7248965271552L, 54009);
    aAl();
    amc localamc = (amc)this.gMC.hlU.hmc;
    localamc.ugX = Build.BRAND;
    localamc.ugW = paramInt;
    localamc.ugV = paramLinkedList;
    GMTrace.o(7248965271552L, 54009);
  }
  
  protected final void aAl()
  {
    GMTrace.i(7248696836096L, 54007);
    b.a locala = new b.a();
    locala.hlX = new amc();
    locala.hlY = new amd();
    locala.uri = "/cgi-bin/mmo2o-bin/manufacturerapinfo";
    locala.hlW = 1707;
    locala.hlZ = 0;
    locala.hma = 0;
    this.gMC = locala.DA();
    GMTrace.o(7248696836096L, 54007);
  }
  
  public final amd aAy()
  {
    GMTrace.i(7249099489280L, 54010);
    amd localamd = (amd)this.gMC.hlV.hmc;
    GMTrace.o(7249099489280L, 54010);
    return localamd;
  }
  
  public final int getType()
  {
    GMTrace.i(7248831053824L, 54008);
    GMTrace.o(7248831053824L, 54008);
    return 1707;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/freewifi/d/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */