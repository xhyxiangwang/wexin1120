package com.tencent.mm.plugin.collect.reward.ui;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.k;
import com.tencent.mm.kernel.e;
import com.tencent.mm.plugin.collect.reward.a.a;
import com.tencent.mm.plugin.collect.reward.a.a.a;
import com.tencent.mm.plugin.collect.reward.a.f;
import com.tencent.mm.plugin.collect.reward.b.b;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.protocal.c.kr;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMGridView;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.r;
import com.tencent.mm.ui.widget.MMEditText;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;
import com.tencent.mm.x.m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class QrRewardSetMoneyUI
  extends QrRewardBaseUI
{
  private String desc;
  private String iDD;
  private TextView jpp;
  private int kLK;
  private ImageView kLU;
  private MMGridView kMF;
  private Button kMG;
  private MMEditText kMH;
  private TextView kMI;
  private TextView kMJ;
  private SparseArray<WalletFormView> kMK;
  private List<Integer> kML;
  private List<Integer> kMM;
  private boolean kMN;
  private Runnable kMO;
  private TextWatcher kMP;
  
  public QrRewardSetMoneyUI()
  {
    GMTrace.i(19374194819072L, 144349);
    this.kMN = false;
    this.kMO = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(19378892439552L, 144384);
        QrRewardSetMoneyUI.a(QrRewardSetMoneyUI.this);
        GMTrace.o(19378892439552L, 144384);
      }
    };
    this.kMP = new TextWatcher()
    {
      public final void afterTextChanged(Editable paramAnonymousEditable)
      {
        GMTrace.i(19354062159872L, 144199);
        if (paramAnonymousEditable.toString().startsWith(".")) {
          paramAnonymousEditable.insert(0, "0");
        }
        String str = paramAnonymousEditable.toString();
        int i = str.indexOf(".");
        int j = str.length();
        if ((i >= 0) && (j - i > 3)) {
          paramAnonymousEditable.delete(i + 3, j);
        }
        for (;;)
        {
          af.H(QrRewardSetMoneyUI.d(QrRewardSetMoneyUI.this));
          af.i(QrRewardSetMoneyUI.d(QrRewardSetMoneyUI.this), 50L);
          GMTrace.o(19354062159872L, 144199);
          return;
          if (i > 6) {
            paramAnonymousEditable.delete(6, i);
          } else if ((i == -1) && (j > 6)) {
            paramAnonymousEditable.delete(6, j);
          }
        }
      }
      
      public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(19353793724416L, 144197);
        GMTrace.o(19353793724416L, 144197);
      }
      
      public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(19353927942144L, 144198);
        GMTrace.o(19353927942144L, 144198);
      }
    };
    GMTrace.o(19374194819072L, 144349);
  }
  
  private boolean anZ()
  {
    GMTrace.i(19375000125440L, 144355);
    int i = 0;
    while (i < this.kML.size())
    {
      if (!((Integer)this.kML.get(i)).equals(this.kMM.get(i)))
      {
        w.i("MicroMsg.QrRewardSetMoneyUI", "modify money: %s, %s", new Object[] { this.kML.get(i), this.kMM.get(i) });
        GMTrace.o(19375000125440L, 144355);
        return true;
      }
      i += 1;
    }
    GMTrace.o(19375000125440L, 144355);
    return false;
  }
  
  private void aoa()
  {
    GMTrace.i(19375134343168L, 144356);
    int i = 0;
    if (i < this.kMM.size())
    {
      WalletFormView localWalletFormView = (WalletFormView)LayoutInflater.from(this.vov.voR).inflate(R.i.ddw, null);
      localWalletFormView.a(this.kMP);
      int j = ((Integer)this.kMM.get(i)).intValue();
      int k = j / 100;
      double d = j / 100.0D;
      if (d > k) {
        localWalletFormView.setText(String.format("%.2f", new Object[] { Double.valueOf(d) }));
      }
      for (;;)
      {
        e(localWalletFormView, 2, false);
        this.kMK.put(i, localWalletFormView);
        i += 1;
        break;
        localWalletFormView.setText(String.format("%d", new Object[] { Integer.valueOf(k) }));
      }
    }
    GMTrace.o(19375134343168L, 144356);
  }
  
  protected final void MH()
  {
    GMTrace.i(19374463254528L, 144351);
    this.kMF = ((MMGridView)findViewById(R.h.cmW));
    this.kMG = ((Button)findViewById(R.h.cmV));
    this.kMI = ((TextView)findViewById(R.h.cmS));
    this.kLU = ((ImageView)findViewById(R.h.cmT));
    this.kMH = ((MMEditText)findViewById(R.h.cmX));
    this.jpp = ((TextView)findViewById(R.h.cmY));
    this.kMJ = ((TextView)findViewById(R.h.cmU));
    String str = m.zH();
    Object localObject = str;
    if (bg.mZ(str)) {
      localObject = m.zI();
    }
    this.jpp.setText(com.tencent.mm.pluginsdk.ui.d.h.a(this.vov.voR, (CharSequence)localObject));
    a.b.a(this.kLU, m.zF(), 0.06F, false);
    localObject = new a((byte)0);
    this.kMF.setAdapter((ListAdapter)localObject);
    this.kMI.setText(getString(R.l.evC, new Object[] { Math.round(this.kLK / 100.0F) }));
    if (this.kMN)
    {
      this.kMG.setText(R.l.evt);
      this.kMJ.setVisibility(8);
    }
    this.kMG.setOnClickListener(new r()
    {
      public final void anQ()
      {
        GMTrace.i(19374060601344L, 144348);
        if (!QrRewardSetMoneyUI.a(QrRewardSetMoneyUI.this)) {
          QrRewardSetMoneyUI.b(QrRewardSetMoneyUI.this);
        }
        for (;;)
        {
          g.paX.i(14721, new Object[] { Integer.valueOf(1), Integer.valueOf(2) });
          GMTrace.o(19374060601344L, 144348);
          return;
          w.i("MicroMsg.QrRewardSetMoneyUI", "amt error!");
        }
      }
    });
    GMTrace.o(19374463254528L, 144351);
  }
  
  public final boolean d(int paramInt1, int paramInt2, final String paramString, k paramk)
  {
    GMTrace.i(19374865907712L, 144354);
    if ((paramk instanceof f))
    {
      paramString = (f)paramk;
      paramString.a(new a.a()
      {
        public final void i(k paramAnonymousk)
        {
          GMTrace.i(19365873319936L, 144287);
          QrRewardSetMoneyUI.a(QrRewardSetMoneyUI.this, paramString.kLj.tGm);
          QrRewardSetMoneyUI.b(QrRewardSetMoneyUI.this, paramString.kLj.desc);
          paramAnonymousk = new Intent();
          paramAnonymousk.putExtra("key_desc", paramString.kLj.desc);
          paramAnonymousk.putExtra("key_photo_url", paramString.kLj.tGm);
          paramAnonymousk.putExtra("key_photo_aeskey", paramString.kLj.tGn);
          paramAnonymousk.putExtra("key_photo_width", paramString.kLj.tGs);
          paramAnonymousk.putExtra("key_icon_width", paramString.kLj.tGo);
          paramAnonymousk.putExtra("key_return_from_first", QrRewardSetMoneyUI.c(QrRewardSetMoneyUI.this));
          QrRewardSetMoneyUI.this.setResult(-1, paramAnonymousk);
          QrRewardSetMoneyUI.this.finish();
          GMTrace.o(19365873319936L, 144287);
        }
      }).b(new a.a()
      {
        public final void i(k paramAnonymousk)
        {
          GMTrace.i(19353525288960L, 144195);
          w.e("MicroMsg.QrRewardSetMoneyUI", "set code error: %s, %s", new Object[] { Integer.valueOf(paramString.kLj.kKx), paramString.kLj.kKy });
          if (!bg.mZ(paramString.kLj.kKy))
          {
            Toast.makeText(QrRewardSetMoneyUI.this, paramString.kLj.kKy, 1).show();
            GMTrace.o(19353525288960L, 144195);
            return;
          }
          Toast.makeText(QrRewardSetMoneyUI.this, R.l.evB, 1).show();
          GMTrace.o(19353525288960L, 144195);
        }
      }).c(new a.a()
      {
        public final void i(k paramAnonymousk)
        {
          GMTrace.i(19373255294976L, 144342);
          w.e("MicroMsg.QrRewardSetMoneyUI", "net error: %s", new Object[] { paramAnonymousk });
          GMTrace.o(19373255294976L, 144342);
        }
      });
    }
    GMTrace.o(19374865907712L, 144354);
    return false;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(19374597472256L, 144352);
    int i = R.i.ddx;
    GMTrace.o(19374597472256L, 144352);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(19374329036800L, 144350);
    super.onCreate(paramBundle);
    oC(R.l.evD);
    hz(1562);
    paramBundle = bg.eG((String)com.tencent.mm.kernel.h.xz().xi().get(w.a.vdK, ""), ",");
    this.kML = new ArrayList();
    if (paramBundle.isEmpty())
    {
      w.i("MicroMsg.QrRewardSetMoneyUI", "use client hardcode amt list");
      this.kML = Arrays.asList(b.kLp);
    }
    for (;;)
    {
      this.kMM = new ArrayList(this.kML);
      this.kLK = ((Integer)com.tencent.mm.kernel.h.xz().xi().get(w.a.vdJ, Integer.valueOf(100000))).intValue();
      this.kMN = getIntent().getBooleanExtra("key_first_flag", false);
      this.kMK = new SparseArray();
      aoa();
      MH();
      GMTrace.o(19374329036800L, 144350);
      return;
      paramBundle = paramBundle.iterator();
      while (paramBundle.hasNext())
      {
        String str = (String)paramBundle.next();
        this.kML.add(Integer.valueOf(bg.getInt(str, 0)));
      }
    }
  }
  
  public void onDestroy()
  {
    GMTrace.i(19374731689984L, 144353);
    super.onDestroy();
    hA(1562);
    af.H(this.kMO);
    GMTrace.o(19374731689984L, 144353);
  }
  
  private final class a
    extends BaseAdapter
  {
    private a()
    {
      GMTrace.i(19363860054016L, 144272);
      GMTrace.o(19363860054016L, 144272);
    }
    
    public final int getCount()
    {
      GMTrace.i(19363994271744L, 144273);
      int i = QrRewardSetMoneyUI.e(QrRewardSetMoneyUI.this).size();
      GMTrace.o(19363994271744L, 144273);
      return i;
    }
    
    public final Object getItem(int paramInt)
    {
      GMTrace.i(19364128489472L, 144274);
      Object localObject = QrRewardSetMoneyUI.e(QrRewardSetMoneyUI.this).get(paramInt);
      GMTrace.o(19364128489472L, 144274);
      return localObject;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(19364262707200L, 144275);
      long l = paramInt;
      GMTrace.o(19364262707200L, 144275);
      return l;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(19364396924928L, 144276);
      if (paramView == null) {
        paramView = (View)QrRewardSetMoneyUI.f(QrRewardSetMoneyUI.this).get(paramInt);
      }
      for (;;)
      {
        GMTrace.o(19364396924928L, 144276);
        return paramView;
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/collect/reward/ui/QrRewardSetMoneyUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */