package com.tencent.mm.plugin.masssend.ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.text.TextUtils.TruncateAt;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.j;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.a.e;
import com.tencent.mm.an.f;
import com.tencent.mm.bt.g;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.plugin.masssend.a.b;
import com.tencent.mm.pluginsdk.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.AnimImageView;
import com.tencent.mm.ui.base.t;
import com.tencent.mm.ui.v;
import com.tencent.mm.x.ap;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

final class c
  extends com.tencent.mm.ui.o<com.tencent.mm.plugin.masssend.a.a>
{
  private static short nGN;
  private static short nGO;
  private static short nGP;
  private static short nGQ;
  private MMActivity fsU;
  int hIP;
  int kye;
  private LayoutInflater mJi;
  private short[] nGR;
  private List<String> nGS;
  String nGT;
  e nGU;
  
  static
  {
    GMTrace.i(11233889615872L, 83699);
    nGN = 1;
    nGO = 2;
    nGP = 3;
    nGQ = 4;
    GMTrace.o(11233889615872L, 83699);
  }
  
  public c(Context paramContext)
  {
    super(paramContext, new com.tencent.mm.plugin.masssend.a.a());
    GMTrace.i(11232413220864L, 83688);
    this.nGT = "";
    this.fsU = ((MMActivity)paramContext);
    this.nGS = new LinkedList();
    this.kye = 10;
    this.hIP = this.kye;
    this.mJi = v.fa(paramContext);
    GMTrace.o(11232413220864L, 83688);
  }
  
  private static int lf(int paramInt)
  {
    GMTrace.i(11233218527232L, 83694);
    if (paramInt <= 2)
    {
      GMTrace.o(11233218527232L, 83694);
      return 100;
    }
    if (paramInt < 10)
    {
      GMTrace.o(11233218527232L, 83694);
      return (paramInt - 2) * 8 + 100;
    }
    if (paramInt < 60)
    {
      paramInt /= 10;
      GMTrace.o(11233218527232L, 83694);
      return (paramInt + 7) * 8 + 100;
    }
    GMTrace.o(11233218527232L, 83694);
    return 204;
  }
  
  public final void Bi(String paramString)
  {
    GMTrace.i(11233084309504L, 83693);
    this.nGT = paramString;
    notifyDataSetChanged();
    GMTrace.o(11233084309504L, 83693);
  }
  
  public final void QA()
  {
    GMTrace.i(11232815874048L, 83691);
    Object localObject = com.tencent.mm.plugin.masssend.a.h.aMy().hhi.a("SELECT count(*) FROM massendinfo", null, 2);
    if (((Cursor)localObject).moveToFirst()) {}
    for (int i = ((Cursor)localObject).getInt(0);; i = 0)
    {
      ((Cursor)localObject).close();
      this.hIP = i;
      localObject = com.tencent.mm.plugin.masssend.a.h.aMy();
      i = this.kye;
      String str = "select massendinfo.clientid,massendinfo.status,massendinfo.createtime,massendinfo.lastmodifytime,massendinfo.filename,massendinfo.thumbfilename,massendinfo.tolist,massendinfo.tolistcount,massendinfo.msgtype,massendinfo.mediatime,massendinfo.datanetoffset,massendinfo.datalen,massendinfo.thumbnetoffset,massendinfo.thumbtotallen,massendinfo.reserved1,massendinfo.reserved2,massendinfo.reserved3,massendinfo.reserved4 from massendinfo   ORDER BY createtime ASC  LIMIT " + i + " offset (SELECT count(*) FROM massendinfo ) -" + i;
      w.v("MicroMsg.MasSendInfoStorage", "getCursor sql:" + str);
      setCursor(((b)localObject).hhi.a(str, null, 0));
      i = getCount();
      if (i > 0) {
        this.nGR = new short[i];
      }
      super.notifyDataSetChanged();
      GMTrace.o(11232815874048L, 83691);
      return;
    }
  }
  
  protected final void QB()
  {
    GMTrace.i(11232547438592L, 83689);
    QA();
    GMTrace.o(11232547438592L, 83689);
  }
  
  public final boolean alk()
  {
    GMTrace.i(11232681656320L, 83690);
    if (this.kye >= this.hIP)
    {
      GMTrace.o(11232681656320L, 83690);
      return true;
    }
    GMTrace.o(11232681656320L, 83690);
    return false;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(11232950091776L, 83692);
    Object localObject1 = (com.tencent.mm.plugin.masssend.a.a)getItem(paramInt);
    int i;
    int j;
    label84:
    label104:
    label128:
    label178:
    label218:
    label264:
    Object localObject2;
    if (paramInt != 0)
    {
      long l1 = ((com.tencent.mm.plugin.masssend.a.a)getItem(paramInt - 1)).hUw;
      paramViewGroup = (com.tencent.mm.plugin.masssend.a.a)getItem(paramInt);
      long l2 = paramViewGroup.hUw;
      if (l2 - l1 < 60000L)
      {
        i = 1;
        if ((l2 - l1) / 180000L >= 1L) {
          break label508;
        }
        j = 1;
        if ((i == 0) && (j == 0)) {
          break label514;
        }
        this.nGR[paramInt] = 2;
        localObject1 = paramViewGroup;
        if ((this.nGR[paramInt] != 1) || (((com.tencent.mm.plugin.masssend.a.a)localObject1).hUw <= 1000L)) {
          break label537;
        }
        paramInt = 1;
        switch (((com.tencent.mm.plugin.masssend.a.a)localObject1).msgType)
        {
        default: 
          paramViewGroup = paramView;
          paramView = (f)paramViewGroup.getTag();
          if (paramInt != 0)
          {
            paramView.mKe.setVisibility(0);
            paramView.mKe.setText(com.tencent.mm.pluginsdk.i.n.c(this.fsU, ((com.tencent.mm.plugin.masssend.a.a)localObject1).hUw, false));
            switch (((com.tencent.mm.plugin.masssend.a.a)localObject1).msgType)
            {
            default: 
              localObject2 = (f)paramViewGroup.getTag();
              ((f)localObject2).nGW.setText(this.fsU.getResources().getQuantityString(R.j.dkk, ((com.tencent.mm.plugin.masssend.a.a)localObject1).nGp, new Object[] { Integer.valueOf(((com.tencent.mm.plugin.masssend.a.a)localObject1).nGp) }));
              if (this.nGS.contains(((com.tencent.mm.plugin.masssend.a.a)localObject1).aMq()))
              {
                ((f)localObject2).nGX.setSingleLine(false);
                ((f)localObject2).nGX.setEllipsize(null);
              }
              break;
            }
          }
          break;
        }
      }
    }
    for (;;)
    {
      Object localObject3 = ((f)localObject2).nGX;
      MMActivity localMMActivity = this.fsU;
      paramView = new ArrayList();
      if ((((com.tencent.mm.plugin.masssend.a.a)localObject1).aMt() != null) && (!((com.tencent.mm.plugin.masssend.a.a)localObject1).aMt().equals(""))) {
        break label1765;
      }
      paramView = "";
      ((TextView)localObject3).setText(com.tencent.mm.pluginsdk.ui.d.h.b(localMMActivity, paramView, ((f)localObject2).nGX.getTextSize()));
      paramInt = (int)((f)localObject2).nGX.getTextSize();
      paramView = ((f)localObject2).nGX.getText().toString();
      com.tencent.mm.bq.a.fromDPToPix(this.fsU, 255);
      localObject3 = new Paint();
      ((Paint)localObject3).setTextSize(paramInt);
      ((Paint)localObject3).measureText(paramView);
      ((f)localObject2).nHa.setOnClickListener(new b(((com.tencent.mm.plugin.masssend.a.a)localObject1).aMq()));
      GMTrace.o(11232950091776L, 83692);
      return paramViewGroup;
      i = 0;
      break;
      label508:
      j = 0;
      break label84;
      label514:
      this.nGR[paramInt] = 1;
      localObject1 = paramViewGroup;
      break label104;
      this.nGR[paramInt] = 1;
      break label104;
      label537:
      paramInt = 0;
      break label128;
      localObject2 = new f();
      if (paramView != null)
      {
        paramViewGroup = paramView;
        if (((f)paramView.getTag()).nHd == nGN) {
          break label178;
        }
      }
      paramViewGroup = this.mJi.inflate(R.i.cZX, null);
      ((f)localObject2).nGW = ((TextView)paramViewGroup.findViewById(R.h.cbo));
      ((f)localObject2).nGX = ((TextView)paramViewGroup.findViewById(R.h.cbq));
      ((f)localObject2).nGY = ((TextView)paramViewGroup.findViewById(R.h.cbr));
      ((f)localObject2).nHa = ((TextView)paramViewGroup.findViewById(R.h.cbm));
      ((f)localObject2).mKe = ((TextView)paramViewGroup.findViewById(R.h.cbw));
      ((f)localObject2).nHc = paramViewGroup.findViewById(R.h.cbn);
      ((f)localObject2).nHd = nGN;
      paramViewGroup.setTag(localObject2);
      break label178;
      localObject2 = new f();
      if (paramView != null)
      {
        paramViewGroup = paramView;
        if (((f)paramView.getTag()).nHd == nGQ) {
          break label178;
        }
      }
      paramViewGroup = this.mJi.inflate(R.i.cZZ, null);
      ((f)localObject2).nGW = ((TextView)paramViewGroup.findViewById(R.h.cbo));
      ((f)localObject2).nGX = ((TextView)paramViewGroup.findViewById(R.h.cbq));
      ((f)localObject2).nGZ = ((TextView)paramViewGroup.findViewById(R.h.cbp));
      ((f)localObject2).nGY = ((TextView)paramViewGroup.findViewById(R.h.cbv));
      ((f)localObject2).nHb = ((AnimImageView)paramViewGroup.findViewById(R.h.cbu));
      ((f)localObject2).nHa = ((TextView)paramViewGroup.findViewById(R.h.cbm));
      ((f)localObject2).mKe = ((TextView)paramViewGroup.findViewById(R.h.cbw));
      ((f)localObject2).nHc = paramViewGroup.findViewById(R.h.cbn);
      ((f)localObject2).nHd = nGQ;
      paramViewGroup.setTag(localObject2);
      break label178;
      localObject2 = new f();
      if (paramView != null)
      {
        paramViewGroup = paramView;
        if (((f)paramView.getTag()).nHd == nGO) {
          break label178;
        }
      }
      paramViewGroup = this.mJi.inflate(R.i.cZW, null);
      ((f)localObject2).nGW = ((TextView)paramViewGroup.findViewById(R.h.cbo));
      ((f)localObject2).nGX = ((TextView)paramViewGroup.findViewById(R.h.cbq));
      ((f)localObject2).lRM = ((ImageView)paramViewGroup.findViewById(R.h.cbs));
      ((f)localObject2).nHa = ((TextView)paramViewGroup.findViewById(R.h.cbm));
      ((f)localObject2).mKe = ((TextView)paramViewGroup.findViewById(R.h.cbw));
      ((f)localObject2).nHc = paramViewGroup.findViewById(R.h.cbn);
      ((f)localObject2).nHd = nGO;
      paramViewGroup.setTag(localObject2);
      break label178;
      localObject2 = new f();
      if (paramView != null)
      {
        paramViewGroup = paramView;
        if (((f)paramView.getTag()).nHd == nGP) {
          break label178;
        }
      }
      paramViewGroup = this.mJi.inflate(R.i.cZY, null);
      ((f)localObject2).nGW = ((TextView)paramViewGroup.findViewById(R.h.cbo));
      ((f)localObject2).nGX = ((TextView)paramViewGroup.findViewById(R.h.cbq));
      ((f)localObject2).lRM = ((ImageView)paramViewGroup.findViewById(R.h.cbs));
      ((f)localObject2).nGZ = ((TextView)paramViewGroup.findViewById(R.h.cbt));
      ((f)localObject2).nHa = ((TextView)paramViewGroup.findViewById(R.h.cbm));
      ((f)localObject2).mKe = ((TextView)paramViewGroup.findViewById(R.h.cbw));
      ((f)localObject2).nHc = paramViewGroup.findViewById(R.h.cbn);
      ((f)localObject2).nHd = nGP;
      paramViewGroup.setTag(localObject2);
      break label178;
      paramView.mKe.setVisibility(8);
      break label218;
      paramView = (f)paramViewGroup.getTag();
      paramView.nGY.setText(((com.tencent.mm.plugin.masssend.a.a)localObject1).aMr());
      com.tencent.mm.pluginsdk.ui.d.h.d(paramView.nGY, 1);
      break label264;
      paramView = (f)paramViewGroup.getTag();
      float f = com.tencent.mm.modelvoice.q.aB(((com.tencent.mm.plugin.masssend.a.a)localObject1).nGq);
      if (((com.tencent.mm.plugin.masssend.a.a)localObject1).aMq().equals(this.nGT))
      {
        paramView.nHb.setVisibility(0);
        paramView.nHb.bWv();
        paramView.nGY.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
      }
      for (;;)
      {
        paramView.nGZ.setText(this.fsU.getString(R.l.eaA, new Object[] { Integer.valueOf((int)f) }));
        paramView.nGY.setWidth(com.tencent.mm.bq.a.fromDPToPix(paramView.nGY.getContext(), lf((int)f)));
        paramView.nHb.setWidth(com.tencent.mm.bq.a.fromDPToPix(paramView.nGY.getContext(), lf((int)f)));
        paramView.nGY.setOnClickListener(new d(((com.tencent.mm.plugin.masssend.a.a)localObject1).aMq()));
        break;
        paramView.nHb.setVisibility(8);
        paramView.nHb.aZz();
        paramView.nGY.setCompoundDrawablesWithIntrinsicBounds(null, null, this.fsU.getResources().getDrawable(R.k.dnf), null);
      }
      paramView = (f)paramViewGroup.getTag();
      ap.AS();
      if (com.tencent.mm.x.c.isSDCardAvailable())
      {
        com.tencent.mm.plugin.masssend.a.h.aMy();
        localObject2 = b.Be(((com.tencent.mm.plugin.masssend.a.a)localObject1).aMr());
        if (localObject2 != null) {
          paramView.lRM.setImageBitmap((Bitmap)localObject2);
        }
      }
      for (;;)
      {
        paramView.lRM.setOnClickListener(new a(((com.tencent.mm.plugin.masssend.a.a)localObject1).aMr(), ((com.tencent.mm.plugin.masssend.a.a)localObject1).nGu));
        break;
        com.tencent.mm.plugin.masssend.a.h.aMy();
        localObject2 = b.b(((com.tencent.mm.plugin.masssend.a.a)localObject1).aMs(), com.tencent.mm.bq.a.getDensity(paramView.lRM.getContext()));
        paramView.lRM.setImageBitmap((Bitmap)localObject2);
        continue;
        paramView.lRM.setImageDrawable(com.tencent.mm.bq.a.b(this.fsU, R.g.bbq));
      }
      paramView = (f)paramViewGroup.getTag();
      com.tencent.mm.modelvideo.o.Na();
      localObject2 = s.lY(((com.tencent.mm.plugin.masssend.a.a)localObject1).aMr());
      localObject2 = com.tencent.mm.an.n.IW().a((String)localObject2, com.tencent.mm.bq.a.getDensity(paramView.lRM.getContext()), this.fsU);
      if (localObject2 == null)
      {
        ap.AS();
        if (!com.tencent.mm.x.c.isSDCardAvailable()) {
          paramView.lRM.setImageDrawable(com.tencent.mm.bq.a.b(this.fsU, R.k.drw));
        }
      }
      for (;;)
      {
        paramView.lRM.setOnClickListener(new c(((com.tencent.mm.plugin.masssend.a.a)localObject1).aMr(), ((com.tencent.mm.plugin.masssend.a.a)localObject1).nGt, ((com.tencent.mm.plugin.masssend.a.a)localObject1).fjT, ((com.tencent.mm.plugin.masssend.a.a)localObject1).nGq));
        if (((com.tencent.mm.plugin.masssend.a.a)localObject1).nGt != 2) {
          break label1716;
        }
        paramView.nGZ.setVisibility(8);
        break;
        paramView.lRM.setImageDrawable(com.tencent.mm.bq.a.b(this.fsU, R.e.aOC));
        continue;
        paramView.lRM.setImageBitmap((Bitmap)localObject2);
      }
      label1716:
      paramView.nGZ.setVisibility(0);
      paramView.nGZ.setText(bg.hn(((com.tencent.mm.plugin.masssend.a.a)localObject1).nGq));
      break label264;
      ((f)localObject2).nGX.setSingleLine(true);
      ((f)localObject2).nGX.setEllipsize(TextUtils.TruncateAt.END);
    }
    label1765:
    Object localObject4 = ((com.tencent.mm.plugin.masssend.a.a)localObject1).aMt().split(";");
    if ((localObject4 != null) && (localObject4.length > 0)) {
      paramView = bg.f((String[])localObject4);
    }
    for (;;)
    {
      if (paramView == null)
      {
        paramView = "";
        break;
      }
      localObject4 = new StringBuilder();
      paramInt = 0;
      if (paramInt < paramView.size())
      {
        String str = com.tencent.mm.x.n.fc((String)paramView.get(paramInt));
        if (paramInt == paramView.size() - 1) {
          ((StringBuilder)localObject4).append(str);
        }
        for (;;)
        {
          paramInt += 1;
          break;
          ((StringBuilder)localObject4).append(str + ", ");
        }
      }
      paramView = ((StringBuilder)localObject4).toString();
      break;
    }
  }
  
  final class a
    implements View.OnClickListener
  {
    private String fnP;
    private int nGu;
    
    public a(String paramString, int paramInt)
    {
      GMTrace.i(11239660978176L, 83742);
      this.fnP = paramString;
      this.nGu = paramInt;
      GMTrace.o(11239660978176L, 83742);
    }
    
    public final void onClick(View paramView)
    {
      GMTrace.i(11239795195904L, 83743);
      w.v("MicroMsg.HistoryAdapter", "image clicked:" + this.fnP);
      ap.AS();
      if (!com.tencent.mm.x.c.isSDCardAvailable())
      {
        t.fn(c.a(c.this));
        GMTrace.o(11239795195904L, 83743);
        return;
      }
      paramView = new StringBuilder();
      ap.AS();
      paramView = com.tencent.mm.x.c.yV() + this.fnP;
      if ((paramView == null) || (paramView.equals("")) || (!e.aZ(paramView)))
      {
        w.d("MicroMsg.HistoryAdapter", "showImg : imgPath is null");
        GMTrace.o(11239795195904L, 83743);
        return;
      }
      Intent localIntent = new Intent();
      localIntent.putExtra("key_compress_type", this.nGu);
      localIntent.putExtra("key_favorite", false);
      localIntent.putExtra("key_image_path", paramView);
      com.tencent.mm.plugin.masssend.a.ifM.c(c.a(c.this), localIntent);
      GMTrace.o(11239795195904L, 83743);
    }
  }
  
  final class b
    implements View.OnClickListener
  {
    private String id;
    
    public b(String paramString)
    {
      GMTrace.i(11231339479040L, 83680);
      this.id = paramString;
      GMTrace.o(11231339479040L, 83680);
    }
    
    public final void onClick(View paramView)
    {
      GMTrace.i(11231473696768L, 83681);
      paramView = com.tencent.mm.plugin.masssend.a.h.aMy().Bf(this.id);
      Intent localIntent = new Intent(c.a(c.this), MassSendMsgUI.class);
      localIntent.putExtra("mass_send_contact_list", paramView.aMt());
      localIntent.putExtra("mass_send_again", true);
      c.a(c.this).startActivity(localIntent);
      GMTrace.o(11231473696768L, 83681);
    }
  }
  
  final class c
    implements View.OnClickListener
  {
    private String fnP;
    private int length;
    private int nGt;
    private int size;
    
    public c(String paramString, int paramInt1, int paramInt2, int paramInt3)
    {
      GMTrace.i(11237916147712L, 83729);
      this.fnP = paramString;
      this.nGt = paramInt1;
      this.length = paramInt3;
      this.size = paramInt2;
      GMTrace.o(11237916147712L, 83729);
    }
    
    public final void onClick(View paramView)
    {
      GMTrace.i(11238050365440L, 83730);
      ap.AS();
      if (!com.tencent.mm.x.c.isSDCardAvailable())
      {
        t.fn(c.a(c.this));
        GMTrace.o(11238050365440L, 83730);
        return;
      }
      if (this.nGt == 2) {}
      for (boolean bool1 = true;; bool1 = false)
      {
        com.tencent.mm.modelvideo.o.Na();
        boolean bool2 = com.tencent.mm.modelvideo.q.lP(s.lX(this.fnP));
        w.i("MicroMsg.HistoryAdapter", "video clicked, path:%s, isExport:%b, typeQt:%b", new Object[] { this.fnP, Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
        com.tencent.mm.plugin.masssend.a.ifM.a(bool1, bool2, c.a(c.this), this.fnP, this.length, this.size);
        GMTrace.o(11238050365440L, 83730);
        return;
      }
    }
  }
  
  final class d
    implements View.OnClickListener
  {
    private String id;
    
    public d(String paramString)
    {
      GMTrace.i(11236573970432L, 83719);
      this.id = paramString;
      GMTrace.o(11236573970432L, 83719);
    }
    
    public final void onClick(View paramView)
    {
      GMTrace.i(11236708188160L, 83720);
      w.v("MicroMsg.HistoryAdapter", "voice clicked:" + this.id);
      if (c.b(c.this) != null)
      {
        c.a(c.this, c.b(c.this).Bj(this.id));
        c.this.notifyDataSetChanged();
      }
      GMTrace.o(11236708188160L, 83720);
    }
  }
  
  static abstract interface e
  {
    public abstract String Bj(String paramString);
  }
  
  static final class f
  {
    ImageView lRM;
    TextView mKe;
    TextView nGW;
    TextView nGX;
    TextView nGY;
    TextView nGZ;
    TextView nHa;
    AnimImageView nHb;
    View nHc;
    short nHd;
    
    f()
    {
      GMTrace.i(11240197849088L, 83746);
      GMTrace.o(11240197849088L, 83746);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/masssend/ui/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */