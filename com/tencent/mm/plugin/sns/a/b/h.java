package com.tencent.mm.plugin.sns.a.b;

import android.os.SystemClock;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.a.b.a.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;

public final class h
{
  public String TAG;
  public int pWI;
  public int pWJ;
  public long pWK;
  public int pWL;
  public int pWM;
  public int pWN;
  public int pWO;
  public a pWP;
  public LinkedList<a> pWQ;
  
  public h()
  {
    GMTrace.i(8162719563776L, 60817);
    this.TAG = "MicroMsg.SnsAdVideoStatistic";
    this.pWI = 0;
    this.pWJ = 0;
    this.pWK = 0L;
    this.pWL = 0;
    this.pWM = 0;
    this.pWN = 0;
    this.pWO = 0;
    this.pWP = new a();
    this.pWQ = new LinkedList();
    GMTrace.o(8162719563776L, 60817);
  }
  
  public h(String paramString)
  {
    GMTrace.i(8162853781504L, 60818);
    this.TAG = "MicroMsg.SnsAdVideoStatistic";
    this.pWI = 0;
    this.pWJ = 0;
    this.pWK = 0L;
    this.pWL = 0;
    this.pWM = 0;
    this.pWN = 0;
    this.pWO = 0;
    this.pWP = new a();
    this.pWQ = new LinkedList();
    this.TAG = ("MicroMsg.SnsAdVideoStatistic:" + paramString);
    GMTrace.o(8162853781504L, 60818);
  }
  
  public final String bfT()
  {
    GMTrace.i(8163122216960L, 60820);
    if (this.pWK == 0L) {}
    for (int i = 0;; i = (int)bg.aG(this.pWK))
    {
      this.pWJ = i;
      w.d(this.TAG, "__staytotaltime " + this.pWK + " " + this.pWJ + " clock: " + SystemClock.elapsedRealtime());
      localObject = new StringBuffer();
      ((StringBuffer)localObject).append("<viewinfo>");
      ((StringBuffer)localObject).append("<downloadstatus>");
      ((StringBuffer)localObject).append(this.pWI);
      ((StringBuffer)localObject).append("</downloadstatus>");
      ((StringBuffer)localObject).append("<staytotaltime>");
      ((StringBuffer)localObject).append(this.pWJ);
      ((StringBuffer)localObject).append("</staytotaltime>");
      if (this.pWL > 0)
      {
        ((StringBuffer)localObject).append("<masktotaltime>");
        ((StringBuffer)localObject).append(this.pWL);
        ((StringBuffer)localObject).append("</masktotaltime>");
      }
      ((StringBuffer)localObject).append(String.format("<playitemlist count=\"%d\">", new Object[] { Integer.valueOf(this.pWQ.size()) }));
      i = 0;
      while (i < this.pWQ.size())
      {
        a locala = (a)this.pWQ.get(i);
        ((StringBuffer)localObject).append("<playitem>");
        ((StringBuffer)localObject).append(String.format("<playcount>%d</playcount>", new Object[] { Integer.valueOf(locala.pXL) }));
        ((StringBuffer)localObject).append(String.format("<playtotaltime>%d</playtotaltime>", new Object[] { Integer.valueOf(locala.pXM) }));
        ((StringBuffer)localObject).append(String.format("<videototaltime>%d</videototaltime>", new Object[] { Integer.valueOf(locala.pXN * 1000) }));
        ((StringBuffer)localObject).append(String.format("<playmode>%d</playmode>", new Object[] { Integer.valueOf(locala.pXO) }));
        ((StringBuffer)localObject).append(String.format("<playorientation>%d</playorientation>", new Object[] { Integer.valueOf(locala.pXP) }));
        ((StringBuffer)localObject).append("</playitem>");
        i += 1;
      }
    }
    ((StringBuffer)localObject).append("</playitemlist>");
    ((StringBuffer)localObject).append("</viewinfo>");
    Object localObject = ((StringBuffer)localObject).toString();
    w.i(this.TAG, "xml " + (String)localObject);
    GMTrace.o(8163122216960L, 60820);
    return (String)localObject;
  }
  
  public final void tN(int paramInt)
  {
    GMTrace.i(8162987999232L, 60819);
    a locala;
    if (this.pWP.pXM <= 0)
    {
      locala = this.pWP;
      if (this.pWP.pXQ != 0L) {
        break label130;
      }
    }
    label130:
    for (int i = 0;; i = (int)bg.aG(this.pWP.pXQ))
    {
      locala.pXM = i;
      if (paramInt != 0) {
        this.pWP.pXN = paramInt;
      }
      w.i(this.TAG, "pushplayitem duration " + this.pWP.pXM + " " + this.pWP.pXP);
      this.pWQ.add(this.pWP);
      this.pWP = new a();
      GMTrace.o(8162987999232L, 60819);
      return;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/a/b/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */