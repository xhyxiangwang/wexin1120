package com.tencent.mm.plugin.qqmail.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.qqmail.b.a;
import com.tencent.mm.plugin.qqmail.b.i;
import com.tencent.mm.plugin.qqmail.b.j;
import com.tencent.mm.plugin.qqmail.b.j.a;
import com.tencent.mm.plugin.qqmail.b.w;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.c;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.q;
import com.tencent.mm.ui.tools.p.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MailAddrListUI
  extends MMActivity
{
  private j oFI;
  private q oJp;
  private TextView oJq;
  private TextView oJr;
  private ListView oJs;
  private a oJt;
  private List<i> oJu;
  private j.a oJv;
  
  public MailAddrListUI()
  {
    GMTrace.i(5495008002048L, 40941);
    this.oJp = null;
    this.oJq = null;
    this.oJr = null;
    this.oFI = null;
    this.oJv = new j.a()
    {
      public final void onComplete()
      {
        GMTrace.i(5499974057984L, 40978);
        if (MailAddrListUI.a(MailAddrListUI.this) != null) {
          MailAddrListUI.a(MailAddrListUI.this).dismiss();
        }
        MailAddrListUI.a(MailAddrListUI.this, MailAddrListUI.b(MailAddrListUI.this).Eh(null));
        if (MailAddrListUI.c(MailAddrListUI.this).size() == 0)
        {
          MailAddrListUI.d(MailAddrListUI.this).setText(R.l.eIx);
          MailAddrListUI.d(MailAddrListUI.this).setVisibility(0);
        }
        Object localObject1 = MailAddrListUI.this.getIntent().getStringArrayExtra("INIT_SELECTED_ADDRS_INTENT_EXTRA");
        if (localObject1 == null) {
          localObject1 = new String[] { "" };
        }
        for (;;)
        {
          int k = localObject1.length;
          int i = 0;
          Object localObject2;
          Object localObject3;
          if (i < k)
          {
            localObject2 = j.Ei(localObject1[i]);
            if (localObject2 != null)
            {
              localObject3 = MailAddrListUI.c(MailAddrListUI.this).iterator();
              while (((Iterator)localObject3).hasNext())
              {
                i locali = (i)((Iterator)localObject3).next();
                if (locali.nke.equalsIgnoreCase(((i)localObject2).nke)) {
                  MailAddrListUI.e(MailAddrListUI.this).c(locali);
                }
              }
            }
          }
          for (int j = 1;; j = 0)
          {
            if (j == 0) {
              MailAddrListUI.e(MailAddrListUI.this).c((i)localObject2);
            }
            i += 1;
            break;
            localObject2 = MailAddrListUI.this;
            localObject3 = new StringBuilder().append(MailAddrListUI.this.getString(R.l.eum));
            if (MailAddrListUI.e(MailAddrListUI.this).aXC() > 0) {}
            for (localObject1 = "(" + MailAddrListUI.e(MailAddrListUI.this).aXC() + ")";; localObject1 = "")
            {
              ((MailAddrListUI)localObject2).rV((String)localObject1);
              MailAddrListUI.e(MailAddrListUI.this).notifyDataSetChanged();
              GMTrace.o(5499974057984L, 40978);
              return;
            }
          }
        }
      }
    };
    GMTrace.o(5495008002048L, 40941);
  }
  
  protected final void MH()
  {
    GMTrace.i(5495410655232L, 40944);
    this.oJs = ((ListView)findViewById(R.h.clD));
    this.oJq = ((TextView)findViewById(R.h.bEy));
    this.oJr = ((TextView)findViewById(R.h.cgD));
    this.oJt = new a(this);
    Object localObject = new com.tencent.mm.ui.tools.p(true, true);
    ((com.tencent.mm.ui.tools.p)localObject).wLV = new p.b()
    {
      public final void Qt()
      {
        GMTrace.i(5557956116480L, 41410);
        GMTrace.o(5557956116480L, 41410);
      }
      
      public final void Qu()
      {
        GMTrace.i(5558090334208L, 41411);
        GMTrace.o(5558090334208L, 41411);
      }
      
      public final void Qv()
      {
        GMTrace.i(5557553463296L, 41407);
        GMTrace.o(5557553463296L, 41407);
      }
      
      public final void Qw()
      {
        GMTrace.i(17265097441280L, 128635);
        GMTrace.o(17265097441280L, 128635);
      }
      
      public final boolean np(String paramAnonymousString)
      {
        GMTrace.i(5557687681024L, 41408);
        GMTrace.o(5557687681024L, 41408);
        return false;
      }
      
      public final void nq(String paramAnonymousString)
      {
        GMTrace.i(5557821898752L, 41409);
        paramAnonymousString = bg.ap(paramAnonymousString, "");
        MailAddrListUI.a(MailAddrListUI.this, MailAddrListUI.b(MailAddrListUI.this).Eh(paramAnonymousString.toLowerCase().trim()));
        if (paramAnonymousString.length() > 0)
        {
          MailAddrListUI.e(MailAddrListUI.this).oJy = true;
          MailAddrListUI.e(MailAddrListUI.this).oJx = false;
          if (MailAddrListUI.c(MailAddrListUI.this).size() != 0) {
            break label136;
          }
          MailAddrListUI.this.kS(false);
          MailAddrListUI.f(MailAddrListUI.this).setVisibility(0);
        }
        for (;;)
        {
          MailAddrListUI.e(MailAddrListUI.this).notifyDataSetChanged();
          GMTrace.o(5557821898752L, 41409);
          return;
          MailAddrListUI.e(MailAddrListUI.this).oJy = false;
          break;
          label136:
          MailAddrListUI.this.kS(true);
          MailAddrListUI.f(MailAddrListUI.this).setVisibility(8);
        }
      }
    };
    a((com.tencent.mm.ui.tools.p)localObject);
    this.oJs.setAdapter(this.oJt);
    this.oJs.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(5561714212864L, 41438);
        paramAnonymousAdapterView = MailAddrListUI.e(MailAddrListUI.this);
        paramAnonymousView = paramAnonymousAdapterView.sH(paramAnonymousInt - MailAddrListUI.g(MailAddrListUI.this).getHeaderViewsCount());
        Object localObject = paramAnonymousView.nke;
        if (paramAnonymousAdapterView.oJz.containsKey(localObject))
        {
          paramAnonymousAdapterView.oJz.remove(localObject);
          paramAnonymousAdapterView.notifyDataSetChanged();
          paramAnonymousView = MailAddrListUI.this;
          localObject = new StringBuilder().append(MailAddrListUI.this.getString(R.l.eum));
          if (MailAddrListUI.e(MailAddrListUI.this).aXC() <= 0) {
            break label178;
          }
        }
        label178:
        for (paramAnonymousAdapterView = "(" + MailAddrListUI.e(MailAddrListUI.this).aXC() + ")";; paramAnonymousAdapterView = "")
        {
          paramAnonymousView.rV(paramAnonymousAdapterView);
          GMTrace.o(5561714212864L, 41438);
          return;
          paramAnonymousAdapterView.oJz.put(localObject, paramAnonymousView);
          break;
        }
      }
    });
    this.oJs.setOnScrollListener(new AbsListView.OnScrollListener()
    {
      public final void onScroll(AbsListView paramAnonymousAbsListView, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(5491920994304L, 40918);
        GMTrace.o(5491920994304L, 40918);
      }
      
      public final void onScrollStateChanged(AbsListView paramAnonymousAbsListView, int paramAnonymousInt)
      {
        GMTrace.i(5491786776576L, 40917);
        if (1 == paramAnonymousInt) {
          MailAddrListUI.this.aKl();
        }
        GMTrace.o(5491786776576L, 40917);
      }
    });
    this.oJu = this.oFI.Eh(null);
    this.oJt.notifyDataSetChanged();
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(5494873784320L, 40940);
        MailAddrListUI.this.setResult(0);
        MailAddrListUI.this.finish();
        GMTrace.o(5494873784320L, 40940);
        return true;
      }
    });
    new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(5547621351424L, 41333);
        BackwardSupportUtil.c.a(MailAddrListUI.g(MailAddrListUI.this));
        GMTrace.o(5547621351424L, 41333);
      }
    };
    a(0, getString(R.l.eul), new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(5500779364352L, 40984);
        paramAnonymousMenuItem = MailAddrListUI.e(MailAddrListUI.this);
        ArrayList localArrayList = new ArrayList();
        Iterator localIterator = paramAnonymousMenuItem.oJz.keySet().iterator();
        while (localIterator.hasNext())
        {
          String str = (String)localIterator.next();
          localArrayList.add(paramAnonymousMenuItem.oJz.get(str));
        }
        ComposeUI.bb(localArrayList);
        MailAddrListUI.this.setResult(-1);
        MailAddrListUI.this.finish();
        GMTrace.o(5500779364352L, 40984);
        return true;
      }
    });
    if (!this.oJu.isEmpty()) {}
    for (boolean bool = true;; bool = false)
    {
      kS(bool);
      localObject = this.vov.voR;
      getString(R.l.dxm);
      this.oJp = h.a((Context)localObject, getString(R.l.euk), true, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(5557285027840L, 41405);
          GMTrace.o(5557285027840L, 41405);
        }
      });
      GMTrace.o(5495410655232L, 40944);
      return;
    }
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(5495142219776L, 40942);
    int i = R.i.ddm;
    GMTrace.o(5495142219776L, 40942);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(5495276437504L, 40943);
    super.onCreate(paramBundle);
    oC(R.l.eum);
    this.oJu = new ArrayList();
    this.oFI = w.aXa().oFI;
    MH();
    this.oFI.a(this.oJv);
    this.oFI.aWQ();
    GMTrace.o(5495276437504L, 40943);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(5495813308416L, 40947);
    super.onDestroy();
    this.oFI.b(this.oJv);
    GMTrace.o(5495813308416L, 40947);
  }
  
  protected void onPause()
  {
    GMTrace.i(5495544872960L, 40945);
    super.onPause();
    GMTrace.o(5495544872960L, 40945);
  }
  
  protected void onResume()
  {
    GMTrace.i(5495679090688L, 40946);
    super.onResume();
    this.oJt.notifyDataSetChanged();
    GMTrace.o(5495679090688L, 40946);
  }
  
  final class a
    extends BaseAdapter
  {
    private final Context context;
    boolean oJx;
    boolean oJy;
    Map<String, i> oJz;
    
    public a(Context paramContext)
    {
      GMTrace.i(5509100863488L, 41046);
      this.oJx = false;
      this.oJy = false;
      this.oJz = new HashMap();
      this.context = paramContext;
      GMTrace.o(5509100863488L, 41046);
    }
    
    private TextView aXD()
    {
      GMTrace.i(5509637734400L, 41050);
      TextView localTextView = new TextView(this.context);
      localTextView.setBackgroundResource(R.g.aZO);
      localTextView.setTextColor(-16777216);
      localTextView.setTextSize(0, MailAddrListUI.this.getResources().getDimensionPixelSize(R.f.aRQ));
      int i = MailAddrListUI.this.getResources().getDimensionPixelSize(R.f.aRS);
      int j = MailAddrListUI.this.getResources().getDimensionPixelSize(R.f.aSq);
      localTextView.setPadding(j, i, j, j);
      GMTrace.o(5509637734400L, 41050);
      return localTextView;
    }
    
    private static String d(i parami)
    {
      GMTrace.i(5509906169856L, 41052);
      if (parami == null)
      {
        GMTrace.o(5509906169856L, 41052);
        return null;
      }
      parami = a.Ed(parami.oFm);
      if (parami.length() > 1) {}
      for (char c = parami.charAt(0);; c = '~') {
        switch (c)
        {
        case '|': 
        case '}': 
        default: 
          if (!bg.l(c)) {
            break label150;
          }
          GMTrace.o(5509906169856L, 41052);
          return String.valueOf(c);
        }
      }
      c = parami.charAt(1);
      if (bg.m(c))
      {
        GMTrace.o(5509906169856L, 41052);
        return String.valueOf(c);
      }
      GMTrace.o(5509906169856L, 41052);
      return "~";
      GMTrace.o(5509906169856L, 41052);
      return "~";
      label150:
      GMTrace.o(5509906169856L, 41052);
      return "~";
    }
    
    public final int aXC()
    {
      GMTrace.i(5509369298944L, 41048);
      int i = this.oJz.size();
      GMTrace.o(5509369298944L, 41048);
      return i;
    }
    
    public final boolean areAllItemsEnabled()
    {
      GMTrace.i(5510308823040L, 41055);
      GMTrace.o(5510308823040L, 41055);
      return false;
    }
    
    public final void c(i parami)
    {
      GMTrace.i(5509235081216L, 41047);
      this.oJz.put(parami.nke, parami);
      GMTrace.o(5509235081216L, 41047);
    }
    
    public final int getCount()
    {
      GMTrace.i(5509503516672L, 41049);
      int i = MailAddrListUI.c(MailAddrListUI.this).size();
      if (i == 0)
      {
        if (this.oJx)
        {
          GMTrace.o(5509503516672L, 41049);
          return 1;
        }
        GMTrace.o(5509503516672L, 41049);
        return 0;
      }
      if (this.oJy)
      {
        GMTrace.o(5509503516672L, 41049);
        return i;
      }
      GMTrace.o(5509503516672L, 41049);
      return i + 1;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(5510174605312L, 41054);
      GMTrace.o(5510174605312L, 41054);
      return 0L;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(5509771952128L, 41051);
      if (paramInt == 0)
      {
        if (this.oJx)
        {
          paramView = aXD();
          paramView.setText(R.l.eut);
          paramInt = MailAddrListUI.this.getResources().getDimensionPixelSize(R.f.aRS);
          paramView.setPadding(paramInt, paramInt, paramInt, paramInt);
          paramView.setTextSize(0, MailAddrListUI.this.getResources().getDimensionPixelSize(R.f.aRb));
          paramView.setGravity(17);
          GMTrace.o(5509771952128L, 41051);
          return paramView;
        }
        if (!this.oJy)
        {
          paramView = aXD();
          paramView.setText(R.l.eus);
          GMTrace.o(5509771952128L, 41051);
          return paramView;
        }
      }
      if ((paramView == null) || (paramView.getTag() == null))
      {
        paramViewGroup = new a();
        paramView = View.inflate(this.context, R.i.ddn, null);
        paramViewGroup.oJA = ((TextView)paramView.findViewById(R.h.clA));
        paramViewGroup.kIZ = ((TextView)paramView.findViewById(R.h.clB));
        paramViewGroup.oJB = ((TextView)paramView.findViewById(R.h.clz));
        paramViewGroup.iiO = ((CheckBox)paramView.findViewById(R.h.clC));
        paramView.setTag(paramViewGroup);
        i locali = sH(paramInt);
        if ((this.oJy) || (paramInt <= 10)) {
          break label397;
        }
        Object localObject = sH(paramInt - 1);
        if (paramInt == 11) {
          localObject = null;
        }
        String str = d(locali);
        localObject = d((i)localObject);
        if (str == null) {
          break label385;
        }
        if (str.equals(localObject)) {
          break label373;
        }
        paramViewGroup.oJA.setText(str.toUpperCase());
        paramViewGroup.oJA.setVisibility(0);
        label297:
        paramViewGroup.kIZ.setText(locali.name);
        paramViewGroup.oJB.setText(locali.nke);
        paramViewGroup = paramViewGroup.iiO;
        if (this.oJz.get(locali.nke) == null) {
          break label409;
        }
      }
      label373:
      label385:
      label397:
      label409:
      for (boolean bool = true;; bool = false)
      {
        paramViewGroup.setChecked(bool);
        GMTrace.o(5509771952128L, 41051);
        return paramView;
        paramViewGroup = (a)paramView.getTag();
        break;
        paramViewGroup.oJA.setVisibility(8);
        break label297;
        paramViewGroup.oJA.setVisibility(8);
        break label297;
        paramViewGroup.oJA.setVisibility(8);
        break label297;
      }
    }
    
    public final boolean isEnabled(int paramInt)
    {
      GMTrace.i(5510443040768L, 41056);
      if (paramInt == 0)
      {
        boolean bool = this.oJy;
        GMTrace.o(5510443040768L, 41056);
        return bool;
      }
      GMTrace.o(5510443040768L, 41056);
      return true;
    }
    
    public final i sH(int paramInt)
    {
      GMTrace.i(5510040387584L, 41053);
      if (this.oJy) {}
      for (;;)
      {
        i locali = (i)MailAddrListUI.c(MailAddrListUI.this).get(paramInt);
        GMTrace.o(5510040387584L, 41053);
        return locali;
        if (paramInt == 0) {
          paramInt = 0;
        } else {
          paramInt -= 1;
        }
      }
    }
    
    final class a
    {
      CheckBox iiO;
      TextView kIZ;
      TextView oJA;
      TextView oJB;
      
      a()
      {
        GMTrace.i(5508966645760L, 41045);
        GMTrace.o(5508966645760L, 41045);
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/qqmail/ui/MailAddrListUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */