package com.tencent.mm.plugin.chatroom.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.a.f;
import com.tencent.mm.g.b.af;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.l.a;
import com.tencent.mm.plugin.messenger.foundation.a.a.g;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.au.a;
import com.tencent.mm.storage.au.b;
import com.tencent.mm.storage.au.d;
import com.tencent.mm.storage.bb;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMLoadMoreListView;
import com.tencent.mm.ui.base.MMLoadMoreListView.a;
import com.tencent.mm.w.f.a;
import com.tencent.mm.x.aa;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.ay;
import com.tencent.mm.x.j;
import com.tencent.mm.x.m;
import java.util.Map;

public class SelectMemberChattingRecordUI
  extends MMActivity
{
  private static final f<Integer, com.tencent.mm.protocal.b.a.c> hdC;
  private com.tencent.mm.ui.base.q iXW;
  private String kEr;
  private MMLoadMoreListView kGN;
  private View kGO;
  private a kGP;
  private String kGQ;
  private int kjE;
  private String mTitle;
  
  static
  {
    GMTrace.i(9152441090048L, 68191);
    hdC = new f(32);
    GMTrace.o(9152441090048L, 68191);
  }
  
  public SelectMemberChattingRecordUI()
  {
    GMTrace.i(9150964695040L, 68180);
    this.kjE = 0;
    GMTrace.o(9150964695040L, 68180);
  }
  
  public static String a(Context paramContext, int paramInt1, String paramString1, String paramString2, int paramInt2)
  {
    GMTrace.i(9151770001408L, 68186);
    String str = "";
    f.a locala = f.a.eC(paramString1);
    Object localObject;
    switch (paramInt1)
    {
    default: 
      localObject = str;
    case 1: 
    case 34: 
    case 3: 
    case 23: 
    case 33: 
    case 43: 
    case 62: 
    case 48: 
    case 42: 
      label216:
      do
      {
        for (;;)
        {
          GMTrace.o(9151770001408L, 68186);
          return (String)localObject;
          localObject = paramString1.substring(paramString1.indexOf(":\n") + 1);
          continue;
          paramString1 = new com.tencent.mm.modelvoice.n(paramString1);
          localObject = paramContext.getString(R.l.exn, new Object[] { Integer.valueOf((int)com.tencent.mm.modelvoice.q.aB(paramString1.time)) });
          continue;
          localObject = paramContext.getString(R.l.dwG);
          continue;
          if (62 == paramInt1) {}
          for (paramInt1 = R.l.dxf;; paramInt1 = R.l.dxv)
          {
            localObject = paramContext.getString(paramInt1);
            break;
          }
          ap.AS();
          paramString1 = com.tencent.mm.x.c.yN().BI(paramString1);
          localObject = paramContext.getString(R.l.exf, new Object[] { paramString1.label });
        }
        localObject = str;
      } while (bg.mY(paramString1).length() <= 0);
      localObject = ay.gz(paramString1);
      if (!TextUtils.isEmpty((CharSequence)localObject)) {
        break;
      }
    }
    for (;;)
    {
      ap.AS();
      localObject = com.tencent.mm.x.c.yN().BH(paramString1);
      ap.AS();
      paramString2 = com.tencent.mm.x.c.yL().SL(paramString2).vq();
      paramString1 = paramString2;
      if (com.tencent.mm.x.o.dW(paramString2)) {
        paramString1 = j.t(j.eV(paramString2));
      }
      if (paramInt2 == 1)
      {
        localObject = paramContext.getString(R.l.dZJ, new Object[] { paramString1, ((au.a)localObject).getDisplayName() });
        break;
      }
      localObject = paramContext.getString(R.l.dZK, new Object[] { paramString1, ((au.a)localObject).getDisplayName() });
      break;
      if (locala == null)
      {
        w.e("MicroMsg.SelectMemberChattingRecordUI", "decode msg content failed");
        GMTrace.o(9151770001408L, 68186);
        return "";
      }
      localObject = str;
      switch (locala.type)
      {
      case 7: 
      case 9: 
      case 10: 
      case 11: 
      case 12: 
      case 13: 
      case 14: 
      case 16: 
      case 18: 
      case 20: 
      case 21: 
      case 22: 
      case 23: 
      default: 
        localObject = "";
        break;
      case 6: 
        localObject = paramContext.getString(R.l.exe, new Object[] { locala.title });
        break;
      case 5: 
        localObject = paramContext.getString(R.l.exl, new Object[] { locala.getTitle() });
        break;
      case 8: 
        localObject = paramContext.getString(R.l.dvj);
        break;
      case 15: 
      case 26: 
      case 27: 
        localObject = paramContext.getString(R.l.dvi);
        break;
      case 25: 
        localObject = paramContext.getString(R.l.dva);
        break;
      case 17: 
        localObject = paramContext.getString(R.l.exf, new Object[] { locala.title });
        break;
      case 19: 
        localObject = paramContext.getString(R.l.exi, new Object[] { locala.title });
        break;
      case 24: 
        paramString2 = locala.hbp;
        if (bg.mZ(paramString2))
        {
          w.e("MicroMsg.SelectMemberChattingRecordUI", "xml is null");
          paramString1 = null;
          if (paramString1 != null) {
            break label1028;
          }
        }
        for (paramString1 = "";; paramString1 = paramString1.desc)
        {
          localObject = paramContext.getString(R.l.exh, new Object[] { bg.ap(paramString1, "") });
          break;
          paramInt1 = paramString2.hashCode();
          paramString1 = (com.tencent.mm.protocal.b.a.c)hdC.get(Integer.valueOf(paramInt1));
          if (paramString1 != null)
          {
            w.d("MicroMsg.SelectMemberChattingRecordUI", "get record msg data from cache");
            break label810;
          }
          if (paramString2.trim().startsWith("<recordinfo>")) {}
          for (paramString1 = bh.p(paramString2, "recordinfo");; paramString1 = bh.p("<recordinfo>" + paramString2 + "</recordinfo>", "recordinfo"))
          {
            if (paramString1 != null) {
              break label955;
            }
            w.e("MicroMsg.SelectMemberChattingRecordUI", "values is null: %s", new Object[] { paramString2 });
            paramString1 = null;
            break;
          }
          paramString2 = new com.tencent.mm.protocal.b.a.c();
          paramString2.title = ((String)paramString1.get(".recordinfo.title"));
          paramString2.desc = ((String)paramString1.get(".recordinfo.desc"));
          paramString2.trr = ((String)paramString1.get(".recordinfo.favusername"));
          hdC.put(Integer.valueOf(paramInt1), paramString2);
          paramString1 = paramString2;
          break label810;
        }
      case 3: 
        localObject = paramContext.getString(R.l.exg, new Object[] { locala.title });
        break;
      case 4: 
        localObject = paramContext.getString(R.l.exm, new Object[] { locala.title });
        break;
      case 2: 
        label810:
        label955:
        label1028:
        localObject = paramContext.getString(R.l.dwG);
        break;
        localObject = paramContext.getString(R.l.dvi);
        break;
        localObject = paramContext.getString(R.l.exj);
        if (locala == null) {
          break;
        }
        if (paramInt2 == 1) {}
        for (paramInt1 = 1;; paramInt1 = 0) {
          switch (locala.hbR)
          {
          case 2: 
          default: 
            localObject = bg.mY(locala.title);
            break label216;
          }
        }
        if (paramInt1 != 0)
        {
          localObject = paramContext.getString(R.l.dxF);
          break;
        }
        localObject = paramContext.getString(R.l.dxI);
        break;
        if (paramInt1 != 0)
        {
          localObject = paramContext.getString(R.l.dxG);
          break;
        }
        localObject = paramContext.getString(R.l.dxD);
        break;
        if (paramInt1 != 0)
        {
          localObject = paramContext.getString(R.l.dxH);
          break;
        }
        localObject = paramContext.getString(R.l.dxE);
        break;
        if (locala == null)
        {
          w.e("MicroMsg.SelectMemberChattingRecordUI", "decode msg content failed");
          GMTrace.o(9151770001408L, 68186);
          return "";
        }
        if (paramInt2 == 1)
        {
          localObject = paramContext.getString(R.l.exb, new Object[] { locala.hcs, locala.hcp });
          break;
        }
        localObject = paramContext.getString(R.l.exb, new Object[] { locala.hcs, locala.hco });
        break;
        if (locala == null)
        {
          w.e("MicroMsg.SelectMemberChattingRecordUI", "decode msg content failed");
          GMTrace.o(9151770001408L, 68186);
          return "";
        }
        if (paramInt2 == 1)
        {
          localObject = paramContext.getString(R.l.exb, new Object[] { locala.hcs, locala.hcG });
          break;
        }
        localObject = paramContext.getString(R.l.exb, new Object[] { locala.hcs, locala.hcF });
        break;
        localObject = paramContext.getString(R.l.exc, new Object[] { locala.title });
        break;
        localObject = paramContext.getString(R.l.exc, new Object[] { "" });
        break;
        localObject = paramContext.getString(R.l.exa, new Object[] { locala.title });
        break;
        localObject = paramContext.getString(R.l.exk, new Object[] { locala.title });
        break;
        localObject = str;
        if (paramString1 == null) {
          break;
        }
        localObject = str;
        if (paramString1.length() <= 0) {
          break;
        }
        paramString1 = au.d.Tr(paramString1);
        localObject = str;
        if (paramString1.siD == null) {
          break;
        }
        localObject = str;
        if (paramString1.siD.length() <= 0) {
          break;
        }
        switch (paramString1.scene)
        {
        case 19: 
        case 20: 
        case 21: 
        default: 
          localObject = paramContext.getString(R.l.eaF, new Object[] { paramString1.getDisplayName() });
          break;
        case 18: 
          localObject = paramContext.getString(R.l.eap, new Object[] { paramString1.getDisplayName() });
          break;
        case 22: 
        case 23: 
        case 24: 
        case 26: 
        case 27: 
        case 28: 
        case 29: 
          localObject = paramContext.getString(R.l.eaz, new Object[] { paramString1.getDisplayName() });
          break;
        case 25: 
          localObject = paramContext.getString(R.l.dZI, new Object[] { paramString1.getDisplayName() });
          break;
          paramString2 = (String)localObject;
        }
        break;
      }
    }
  }
  
  protected static String a(com.tencent.mm.storage.q paramq, String paramString)
  {
    GMTrace.i(9151501565952L, 68184);
    if (paramq == null)
    {
      GMTrace.o(9151501565952L, 68184);
      return null;
    }
    paramq = paramq.fc(paramString);
    GMTrace.o(9151501565952L, 68184);
    return paramq;
  }
  
  protected final void MH()
  {
    GMTrace.i(9151367348224L, 68183);
    super.MH();
    rV(bg.mY(this.mTitle));
    this.kGN = ((MMLoadMoreListView)findViewById(R.h.cbR));
    this.kGN.bXd();
    this.kGP = new a(this, this.kEr, this.kGQ, this.kjE);
    this.kGN.setAdapter(this.kGP);
    this.kGO = findViewById(R.h.cuL);
    if (this.kjE == 0) {}
    for (int i = 1;; i = 0)
    {
      if (i != 0)
      {
        this.kGO.setVisibility(0);
        this.kGN.setVisibility(8);
      }
      this.kGN.setOnItemClickListener(new AdapterView.OnItemClickListener()
      {
        public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
        {
          GMTrace.i(9156333404160L, 68220);
          paramAnonymousAdapterView = (au)SelectMemberChattingRecordUI.a(SelectMemberChattingRecordUI.this).getItem(paramAnonymousInt);
          if (paramAnonymousAdapterView != null) {
            SelectMemberChattingRecordUI.a(SelectMemberChattingRecordUI.this, paramAnonymousAdapterView.field_msgId);
          }
          GMTrace.o(9156333404160L, 68220);
        }
      });
      this.kGN.vHo = new MMLoadMoreListView.a()
      {
        public final void and()
        {
          GMTrace.i(9102780530688L, 67821);
          SelectMemberChattingRecordUI.a locala;
          if (SelectMemberChattingRecordUI.a(SelectMemberChattingRecordUI.this) != null)
          {
            locala = SelectMemberChattingRecordUI.a(SelectMemberChattingRecordUI.this);
            locala.kGT -= 16;
            if ((bg.mZ(SelectMemberChattingRecordUI.c(locala.kGR))) || (!m.eZ(SelectMemberChattingRecordUI.c(locala.kGR)))) {
              break label111;
            }
            ap.AS();
            locala.setCursor(com.tencent.mm.x.c.yN().bs(locala.jvR, locala.hIP - locala.kGT));
          }
          for (;;)
          {
            SelectMemberChattingRecordUI.a(SelectMemberChattingRecordUI.this).notifyDataSetChanged();
            GMTrace.o(9102780530688L, 67821);
            return;
            label111:
            if (!m.eZ(SelectMemberChattingRecordUI.c(locala.kGR)))
            {
              ap.AS();
              locala.setCursor(com.tencent.mm.x.c.yN().B(locala.jvR, locala.kGS, locala.hIP - locala.kGT));
            }
          }
        }
      };
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(9073118412800L, 67600);
          SelectMemberChattingRecordUI.this.setResult(0);
          SelectMemberChattingRecordUI.this.finish();
          GMTrace.o(9073118412800L, 67600);
          return true;
        }
      });
      GMTrace.o(9151367348224L, 68183);
      return;
    }
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(9151635783680L, 68185);
    int i = R.i.dfx;
    GMTrace.o(9151635783680L, 68185);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(9151098912768L, 68181);
    super.onCreate(paramBundle);
    w.i("MicroMsg.SelectMemberChattingRecordUI", "[onCreate]");
    this.kEr = getIntent().getStringExtra("RoomInfo_Id");
    this.kGQ = getIntent().getStringExtra("room_member");
    w.i("MicroMsg.SelectMemberChattingRecordUI", "roomId:%s", new Object[] { this.kEr });
    this.mTitle = getIntent().getStringExtra("title");
    if ((!bg.mZ(this.kGQ)) && (m.eZ(this.kGQ)))
    {
      ap.AS();
      this.kjE = com.tencent.mm.x.c.yN().BS(this.kEr);
    }
    for (;;)
    {
      MH();
      GMTrace.o(9151098912768L, 68181);
      return;
      if (!m.eZ(this.kGQ))
      {
        ap.AS();
        this.kjE = com.tencent.mm.x.c.yN().cP(this.kEr, this.kGQ);
      }
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(9151233130496L, 68182);
    super.onDestroy();
    if ((this.iXW != null) && (this.iXW.isShowing())) {
      this.iXW.dismiss();
    }
    GMTrace.o(9151233130496L, 68182);
  }
  
  public final class a
    extends com.tencent.mm.ui.o<au>
  {
    int hIP;
    String jvR;
    String kGS;
    int kGT;
    private com.tencent.mm.storage.q kGU;
    Context mContext;
    
    public a(Context paramContext, String paramString1, String paramString2, int paramInt)
    {
      super(new au());
      GMTrace.i(9129489858560L, 68020);
      this.kGT = -1;
      this.hIP = -1;
      this.mContext = paramContext;
      this.hIP = paramInt;
      this.jvR = paramString1;
      this.kGS = paramString2;
      ap.AS();
      this.kGU = com.tencent.mm.x.c.yU().gn(SelectMemberChattingRecordUI.b(SelectMemberChattingRecordUI.this));
      GMTrace.o(9129489858560L, 68020);
    }
    
    private static boolean a(CharSequence paramCharSequence, TextView paramTextView)
    {
      GMTrace.i(9130026729472L, 68024);
      if ((paramCharSequence != null) && (paramCharSequence.length() != 0))
      {
        paramTextView.setText(h.a(paramTextView.getContext(), paramCharSequence));
        paramTextView.setVisibility(0);
        GMTrace.o(9130026729472L, 68024);
        return true;
      }
      paramTextView.setVisibility(8);
      GMTrace.o(9130026729472L, 68024);
      return false;
    }
    
    public final void QA()
    {
      GMTrace.i(9129624076288L, 68021);
      if ((this.kGT < 0) || (this.kGT > this.hIP)) {
        this.kGT = (this.hIP - 16);
      }
      if ((!bg.mZ(SelectMemberChattingRecordUI.c(SelectMemberChattingRecordUI.this))) && (m.eZ(SelectMemberChattingRecordUI.c(SelectMemberChattingRecordUI.this))))
      {
        ap.AS();
        setCursor(com.tencent.mm.x.c.yN().bs(this.jvR, this.hIP - this.kGT));
        GMTrace.o(9129624076288L, 68021);
        return;
      }
      if (!m.eZ(SelectMemberChattingRecordUI.c(SelectMemberChattingRecordUI.this)))
      {
        ap.AS();
        setCursor(com.tencent.mm.x.c.yN().B(this.jvR, this.kGS, this.hIP - this.kGT));
      }
      GMTrace.o(9129624076288L, 68021);
    }
    
    protected final void QB()
    {
      GMTrace.i(9129758294016L, 68022);
      QA();
      GMTrace.o(9129758294016L, 68022);
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(9129892511744L, 68023);
      View localView = paramView;
      if (paramView == null)
      {
        localView = LayoutInflater.from(this.context).inflate(R.i.daf, null, false);
        paramView = new SelectMemberChattingRecordUI.b();
        paramView.iiL = ((ImageView)localView.findViewById(R.h.bjt));
        paramView.kfQ = ((TextView)localView.findViewById(R.h.cgr));
        paramView.kGV = ((TextView)localView.findViewById(R.h.cdQ));
        paramView.kGW = ((TextView)localView.findViewById(R.h.cDm));
        localView.setTag(paramView);
      }
      au localau = (au)getItem(paramInt);
      SelectMemberChattingRecordUI.b localb = (SelectMemberChattingRecordUI.b)localView.getTag();
      a.b.a(localb.iiL, this.kGS);
      paramView = this.kGS;
      ap.AS();
      Object localObject = com.tencent.mm.x.c.yL().SL(paramView);
      if (!bg.mZ(((af)localObject).field_conRemark)) {}
      for (paramViewGroup = ((af)localObject).field_conRemark;; paramViewGroup = SelectMemberChattingRecordUI.a(this.kGU, ((af)localObject).field_username))
      {
        paramView = paramViewGroup;
        if (bg.mZ(paramViewGroup)) {
          paramView = ((x)localObject).vp();
        }
        paramViewGroup = paramView;
        if (!a.eE(((af)localObject).field_type))
        {
          ap.AS();
          localObject = com.tencent.mm.x.c.yM().BV(((af)localObject).field_username);
          paramViewGroup = paramView;
          if (localObject != null)
          {
            paramViewGroup = paramView;
            if (!bg.mZ(((bb)localObject).field_conRemark)) {
              paramViewGroup = ((bb)localObject).field_conRemark;
            }
          }
        }
        a(paramViewGroup, localb.kfQ);
        paramView = this.kGS;
        a(SelectMemberChattingRecordUI.a(ab.getContext(), localau.field_type, localau.field_content, paramView, localau.field_isSend).trim(), localb.kGV);
        a(com.tencent.mm.pluginsdk.i.n.c(SelectMemberChattingRecordUI.this, localau.field_createTime, true), localb.kGW);
        GMTrace.o(9129892511744L, 68023);
        return localView;
      }
    }
  }
  
  private static final class b
  {
    public ImageView iiL;
    public TextView kGV;
    public TextView kGW;
    public TextView kfQ;
    
    public b()
    {
      GMTrace.i(9130563600384L, 68028);
      GMTrace.o(9130563600384L, 68028);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/chatroom/ui/SelectMemberChattingRecordUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */