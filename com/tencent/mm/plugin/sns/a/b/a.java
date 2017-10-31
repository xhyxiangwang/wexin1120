package com.tencent.mm.plugin.sns.a.b;

import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.storage.b;
import com.tencent.mm.protocal.c.bdk;
import com.tencent.mm.protocal.c.be;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class a
{
  long hNx;
  public String hNy;
  private String iLj;
  boolean kpQ;
  public int lyG;
  public int oja;
  public boolean pVF;
  public bdk pVG;
  public View pVH;
  public View pVI;
  public int pVJ;
  public int pVK;
  public int pVL;
  private View pVM;
  private int pVN;
  private com.tencent.mm.plugin.sns.storage.a pVO;
  b pVP;
  int pVQ;
  private int pVR;
  int pVS;
  private int pVT;
  long pVU;
  long pVV;
  private int pVW;
  private int pVX;
  long pVY;
  private int pVZ;
  private int pWa;
  long pWb;
  private int pWc;
  private int pWd;
  long pWe;
  private int pWf;
  private int pWg;
  long pWh;
  int pWi;
  int pWj;
  int pWk;
  int pWl;
  int pWm;
  int position;
  
  public a(com.tencent.mm.plugin.sns.storage.a parama, long paramLong, View paramView1, int paramInt1, View paramView2, int paramInt2, int paramInt3, bdk parambdk, int paramInt4, b paramb)
  {
    GMTrace.i(20053068087296L, 149407);
    this.pVF = false;
    this.oja = 1;
    this.position = 0;
    this.pVJ = 0;
    this.lyG = 0;
    this.pVK = 0;
    this.pVN = 0;
    this.hNy = "";
    this.hNx = 0L;
    this.pVO = null;
    this.iLj = "";
    this.pVQ = 55450;
    this.pVR = 55450;
    this.pVS = 55450;
    this.pVT = 55450;
    this.pVU = 0L;
    this.pVV = 0L;
    this.pVW = 55450;
    this.pVX = 55450;
    this.pVY = 0L;
    this.pVZ = 55450;
    this.pWa = 55450;
    this.pWb = 0L;
    this.pWc = 55450;
    this.pWd = 55450;
    this.pWe = 0L;
    this.pWf = 55450;
    this.pWg = 55450;
    this.pWh = 0L;
    this.pWi = 0;
    this.pWj = -1;
    this.pWk = -1;
    this.pWl = 0;
    this.pWm = 0;
    this.kpQ = false;
    this.position = paramInt4;
    this.pVH = paramView1;
    this.pVG = parambdk;
    this.pVP = paramb;
    this.pVO = parama;
    this.oja = paramInt3;
    if (parama == null)
    {
      paramView1 = "";
      this.iLj = paramView1;
      if (parama != null) {
        break label345;
      }
    }
    label345:
    for (parama = "";; parama = bg.ap(parama.qhb, ""))
    {
      this.hNy = parama;
      this.hNx = paramLong;
      this.pVL = paramInt1;
      this.pVM = paramView2;
      this.pVN = paramInt2;
      if (this.pVH != null) {
        this.pVI = this.pVH.findViewById(i.f.pIT);
      }
      MH();
      GMTrace.o(20053068087296L, 149407);
      return;
      paramView1 = bg.ap(parama.iLj, "");
      break;
    }
  }
  
  private void MH()
  {
    GMTrace.i(8163659087872L, 60824);
    if (this.lyG == 0)
    {
      BackwardSupportUtil.b.a(this.pVH.getContext(), 50.0F);
      this.lyG = this.pVH.getHeight();
      if (this.pVI != null) {
        this.pVJ = this.pVI.getHeight();
      }
      if (this.lyG == 0)
      {
        GMTrace.o(8163659087872L, 60824);
        return;
      }
      int i = 0;
      if (this.pVM != null) {
        i = this.pVM.getBottom();
      }
      this.lyG -= this.pVJ;
      this.pVK = (this.lyG / 2);
      this.pVL = (this.pVL - i - this.pVN);
      w.i("MicroMsg.AdViewStatic", "viewHeight " + this.lyG + " SCREEN_HEIGHT: " + this.pVL + " abottom: " + i + " stHeight: " + this.pVN + " commentViewHeight:" + this.pVJ);
    }
    GMTrace.o(8163659087872L, 60824);
  }
  
  public final void bfQ()
  {
    int j = 1;
    GMTrace.i(8163793305600L, 60825);
    int m;
    int k;
    int n;
    int i1;
    if (this.pVH != null)
    {
      MH();
      if ((this.kpQ) || (this.lyG <= 0))
      {
        GMTrace.o(8163793305600L, 60825);
        return;
      }
      this.pVF = true;
      m = this.pVH.getTop();
      k = this.pVH.getBottom() - this.pVJ;
      if ((this.pVQ == 55450) && (this.pVR == 55450))
      {
        this.pVQ = m;
        this.pVR = k;
      }
      this.pVS = m;
      this.pVT = k;
      if (m < 0)
      {
        n = m + this.lyG;
        i1 = this.lyG - n;
        if ((n < this.pVK) || (this.pVW != 55450)) {
          break label840;
        }
        this.pVW = m;
        this.pVX = k;
        this.pVY = System.currentTimeMillis();
        w.i("MicroMsg.AdViewStatic", "up first touch half" + n + " top " + m + " viewhieght " + this.lyG + " inscreenval: " + n + " outscreenval: " + i1);
      }
    }
    label683:
    label824:
    label832:
    label840:
    for (int i = 0;; i = 1)
    {
      if ((i1 >= this.pVK) && (this.pVZ == 55450) && (i != 0) && (this.pVY > 0L))
      {
        this.pVZ = m;
        this.pWa = k;
        this.pWb = System.currentTimeMillis();
        w.i("MicroMsg.AdViewStatic", "down first touch half" + n + " bottom " + k + " viewhieght " + this.lyG + " inscreenval: " + n + " outscreenval: " + i1);
      }
      if (k > this.pVL)
      {
        n = k - this.pVL;
        i1 = this.lyG - n;
        i = j;
        if (i1 >= this.pVK)
        {
          i = j;
          if (this.pVW == 55450)
          {
            this.pVW = m;
            this.pVX = k;
            this.pVY = System.currentTimeMillis();
            w.i("MicroMsg.AdViewStatic", "up first touch half" + n + " top " + m + " viewhieght " + this.lyG + " inscreenval: " + i1 + " outscreenval: " + n);
            i = 0;
          }
        }
        if ((n >= this.pVK) && (this.pVZ == 55450) && (i != 0) && (this.pVY > 0L))
        {
          this.pVZ = m;
          this.pWa = k;
          this.pWb = System.currentTimeMillis();
          w.i("MicroMsg.AdViewStatic", "down first touch half" + n + " bottom " + k + " viewhieght " + this.lyG + " inscreenval: " + i1 + " outscreenval: " + n);
        }
      }
      if ((m >= 0) && (k <= this.pVL))
      {
        if (this.pWe == 0L)
        {
          this.pWc = m;
          this.pWd = k;
          this.pWe = System.currentTimeMillis();
        }
        if (m >= 0) {
          break label824;
        }
        i = -m;
        if ((this.pWj == -1) || (this.pWj > i)) {
          this.pWj = i;
        }
        if (k <= this.pVL) {
          break label832;
        }
        i = k - this.pVL;
        if ((this.pWk != -1) && (this.pWk <= i)) {}
      }
      for (this.pWk = i;; this.pWk = 0)
      {
        j = this.lyG;
        i = j;
        if (m < 0) {
          i = j + m;
        }
        j = i;
        if (k > this.pVL) {
          j = i - (k - this.pVL);
        }
        if ((this.pWi == -1) || (this.pWi < j)) {
          this.pWi = j;
        }
        GMTrace.o(8163793305600L, 60825);
        return;
        if ((this.pWh != 0L) || (this.pWe == 0L)) {
          break;
        }
        this.pWf = m;
        this.pWg = k;
        this.pWh = System.currentTimeMillis();
        break;
        this.pWj = 0;
        break label683;
      }
    }
  }
  
  public final be bfR()
  {
    GMTrace.i(8163927523328L, 60826);
    be localbe = new be();
    if (this.pVG != null)
    {
      localbe.tuO = this.pVG.uvj;
      localbe.bTH = this.pVG.uvg;
      GMTrace.o(8163927523328L, 60826);
      return localbe;
    }
    GMTrace.o(8163927523328L, 60826);
    return null;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/a/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */