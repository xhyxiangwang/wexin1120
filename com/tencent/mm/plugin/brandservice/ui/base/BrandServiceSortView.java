package com.tencent.mm.plugin.brandservice.ui.base;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.widget.AdapterView;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.n;
import com.tencent.mm.ae.m;
import com.tencent.mm.ae.m.a;
import com.tencent.mm.ae.m.a.a;
import com.tencent.mm.plugin.brandservice.a;
import com.tencent.mm.plugin.brandservice.a.b;
import com.tencent.mm.plugin.brandservice.a.d.a;
import com.tencent.mm.plugin.brandservice.a.k;
import com.tencent.mm.pluginsdk.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.ui.base.VerticalScrollBar;
import com.tencent.mm.ui.base.o.d;
import com.tencent.mm.ui.contact.u;
import com.tencent.mm.ui.widget.g;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class BrandServiceSortView
  extends BaseSortView
  implements View.OnCreateContextMenuListener, AdapterView.OnItemLongClickListener, d.a, BaseSortView.a
{
  private boolean NW;
  private String jqc;
  private int kkC;
  private int kkD;
  private g kkG;
  public boolean kkl;
  private HashMap<String, SpannableString> klG;
  private com.tencent.mm.plugin.brandservice.a.d klH;
  private int klI;
  private boolean klJ;
  public a klK;
  private String klL;
  private View klM;
  private TextView klN;
  private o.d klO;
  private ListView kls;
  
  public BrandServiceSortView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(10900492779520L, 81215);
    this.klG = new HashMap();
    this.klH = new com.tencent.mm.plugin.brandservice.a.d();
    this.klI = 251658241;
    this.kkC = 0;
    this.kkD = 0;
    this.klO = new o.d()
    {
      public final void c(MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
      {
        GMTrace.i(10905458835456L, 81252);
        if (bg.mZ(BrandServiceSortView.d(BrandServiceSortView.this)))
        {
          w.i("MicroMsg.BrandServiceSortView", "username is null or nil.");
          GMTrace.o(10905458835456L, 81252);
          return;
        }
        if (paramAnonymousMenuItem.getItemId() == 0)
        {
          w.i("MicroMsg.BrandServiceSortView", "Menu Item selected, pos(%d)", new Object[] { Integer.valueOf(paramAnonymousInt) });
          ap.AS();
          com.tencent.mm.storage.x localx = c.yL().SL(BrandServiceSortView.d(BrandServiceSortView.this));
          com.tencent.mm.ae.d locald = com.tencent.mm.ae.f.iv(BrandServiceSortView.d(BrandServiceSortView.this));
          BrandServiceSortView.a(BrandServiceSortView.this, locald, BrandServiceSortView.this.getContext(), localx, paramAnonymousMenuItem.getGroupId());
        }
        GMTrace.o(10905458835456L, 81252);
      }
    };
    this.klJ = false;
    L(false);
    refresh();
    paramContext = this.klH;
    if ((this != null) && (!paramContext.kiR.contains(this)))
    {
      w.i("MicroMsg.BrandService.BrandServiceMgr", "addListener:add");
      paramContext.kiR.add(this);
    }
    this.kkG = new g(getContext());
    this.klz = this;
    this.WK = new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(10894050328576L, 81167);
        paramAnonymousAdapterView = paramAnonymousView.getTag();
        if ((paramAnonymousAdapterView == null) || (!(paramAnonymousAdapterView instanceof BrandServiceSortView.b)))
        {
          w.w("MicroMsg.BrandServiceSortView", "view tag is null or is not a instance of ResHolder.");
          GMTrace.o(10894050328576L, 81167);
          return;
        }
        paramAnonymousView = (BrandServiceSortView.b)paramAnonymousAdapterView;
        if (bg.mZ(paramAnonymousView.username))
        {
          w.w("MicroMsg.BrandServiceSortView", "username is null or nil.");
          GMTrace.o(10894050328576L, 81167);
          return;
        }
        com.tencent.mm.ay.f.kx(paramAnonymousView.username);
        u.j(BrandServiceSortView.a(BrandServiceSortView.this), 12, 4, paramAnonymousInt - 1);
        if (BrandServiceSortView.b(BrandServiceSortView.this))
        {
          paramAnonymousAdapterView = new Intent();
          paramAnonymousAdapterView.putExtra("Select_Contact", paramAnonymousView.username);
          paramAnonymousAdapterView.putExtra("Select_Conv_User", paramAnonymousView.username);
          if ((BrandServiceSortView.this.getContext() instanceof Activity))
          {
            paramAnonymousView = (Activity)BrandServiceSortView.this.getContext();
            paramAnonymousView.setResult(-1, paramAnonymousAdapterView);
            paramAnonymousView.finish();
            GMTrace.o(10894050328576L, 81167);
            return;
          }
        }
        paramAnonymousView = paramAnonymousView.username;
        paramAnonymousAdapterView = BrandServiceSortView.this.getContext();
        w.i("MicroMsg.BrandService.BrandServiceApplication", "startChattingUI");
        paramAnonymousView = new Intent().putExtra("Chat_User", paramAnonymousView);
        paramAnonymousView.putExtra("finish_direct", true);
        paramAnonymousView.putExtra("img_gallery_enter_from_chatting_ui", true);
        a.ifM.e(paramAnonymousView, paramAnonymousAdapterView);
        GMTrace.o(10894050328576L, 81167);
      }
    };
    this.klv = this;
    GMTrace.o(10900492779520L, 81215);
  }
  
  public final void L(boolean paramBoolean)
  {
    GMTrace.i(10902237609984L, 81228);
    this.NW = paramBoolean;
    i(this.klN, paramBoolean);
    GMTrace.o(10902237609984L, 81228);
  }
  
  public final void Y(List<f> paramList)
  {
    GMTrace.i(10902103392256L, 81227);
    if ((this.klN != null) && (paramList != null)) {
      this.klN.setText(getContext().getString(R.l.dEf, new Object[] { Integer.valueOf(paramList.size()) }));
    }
    GMTrace.o(10902103392256L, 81227);
  }
  
  public final boolean a(String paramString, f paramf)
  {
    GMTrace.i(10900895432704L, 81218);
    if ((!bg.mZ(paramString)) && (paramf != null))
    {
      this.klL = paramString;
      paramf = (b)paramf.data;
      if ((paramf == null) || (paramf.jqN == null))
      {
        w.w("MicroMsg.BrandServiceSortView", "BrandServiceItem or contact is null.");
        GMTrace.o(10900895432704L, 81218);
        return false;
      }
      Object localObject = paramf.jqN;
      paramf = ((com.tencent.mm.storage.x)localObject).vq();
      String str = ((com.tencent.mm.storage.x)localObject).qW();
      localObject = ((com.tencent.mm.storage.x)localObject).qX();
      paramString = paramString.toUpperCase();
      if (((!bg.mZ(paramf)) && (paramf.toUpperCase().indexOf(paramString) != -1)) || ((!bg.mZ(str)) && (str.toUpperCase().indexOf(paramString) != -1)) || ((!bg.mZ((String)localObject)) && (((String)localObject).toUpperCase().startsWith(paramString))))
      {
        GMTrace.o(10900895432704L, 81218);
        return true;
      }
    }
    GMTrace.o(10900895432704L, 81218);
    return false;
  }
  
  public final void ahA()
  {
    GMTrace.i(10901700739072L, 81224);
    refresh();
    GMTrace.o(10901700739072L, 81224);
  }
  
  public final VerticalScrollBar ahO()
  {
    GMTrace.i(10901163868160L, 81220);
    VerticalScrollBar localVerticalScrollBar = (VerticalScrollBar)findViewById(R.h.cyc);
    GMTrace.o(10901163868160L, 81220);
    return localVerticalScrollBar;
  }
  
  public final View ahP()
  {
    GMTrace.i(10901432303616L, 81222);
    View localView = findViewById(R.h.cgA);
    GMTrace.o(10901432303616L, 81222);
    return localView;
  }
  
  public final e.a ahQ()
  {
    GMTrace.i(10901566521344L, 81223);
    e.a local2 = new e.a()
    {
      public final View a(f paramAnonymousf, View paramAnonymousView, boolean paramAnonymousBoolean1, boolean paramAnonymousBoolean2)
      {
        GMTrace.i(10909619585024L, 81283);
        long l = bg.Pq();
        Context localContext = BrandServiceSortView.this.getContext();
        BrandServiceSortView.b localb;
        if (paramAnonymousView == null)
        {
          paramAnonymousView = LayoutInflater.from(localContext).inflate(R.i.cNK, null);
          localb = new BrandServiceSortView.b();
          localb.kjl = ((TextView)paramAnonymousView.findViewById(R.h.brA));
          localb.iiK = paramAnonymousView.findViewById(R.h.byZ);
          localb.iiL = ((ImageView)paramAnonymousView.findViewById(R.h.bie));
          localb.kkL = ((ImageView)paramAnonymousView.findViewById(R.h.cfY));
          localb.kfQ = ((TextView)paramAnonymousView.findViewById(R.h.bnC));
          localb.kkM = paramAnonymousView.findViewById(R.h.cvb);
          paramAnonymousView.setTag(localb);
        }
        b localb1;
        for (;;)
        {
          localb1 = (b)paramAnonymousf.data;
          if (localb1 != null) {
            break;
          }
          w.e("MicroMsg.BrandServiceSortView", "should not be empty");
          GMTrace.o(10909619585024L, 81283);
          return paramAnonymousView;
          localb = (BrandServiceSortView.b)paramAnonymousView.getTag();
        }
        int i;
        if ((BrandServiceSortView.this.klx) && (paramAnonymousBoolean1))
        {
          localb.kjl.setText(paramAnonymousf.klX);
          localb.kjl.setVisibility(0);
          localb.username = localb1.userName;
          localb.iconUrl = localb1.kiP.field_brandIconURL;
          localb.iiL.setTag(localb1.userName);
          localb.ahZ();
          paramAnonymousf = localb1.jqN.vq();
          BrandServiceSortView.a(BrandServiceSortView.this, localb.kfQ, localContext, paramAnonymousf, (int)localb.kfQ.getTextSize());
          w.v("MicroMsg.BrandServiceSortView", "bizinfo status%d", new Object[] { Integer.valueOf(localb1.kiP.field_status) });
          paramAnonymousf = localb.kkL;
          if ((!BrandServiceSortView.c(BrandServiceSortView.this)) || (localb1.kiP.field_status != 1)) {
            break label483;
          }
          i = 0;
          label346:
          paramAnonymousf.setVisibility(i);
          if ((BrandServiceSortView.this.mMode != 0) || (!paramAnonymousBoolean2)) {
            break label490;
          }
          localb.kkM.setBackgroundResource(R.g.aYd);
          label378:
          if (!BrandServiceSortView.this.kly) {
            break label504;
          }
          localb.iiK.setPadding(localb.iiK.getPaddingLeft(), localb.iiK.getPaddingTop(), (int)BrandServiceSortView.this.getContext().getResources().getDimension(R.f.aQW), localb.iiK.getPaddingBottom());
        }
        for (;;)
        {
          w.v("MicroMsg.BrandServiceSortView", "get view use %d ms", new Object[] { Long.valueOf(bg.aG(l)) });
          GMTrace.o(10909619585024L, 81283);
          return paramAnonymousView;
          localb.kjl.setVisibility(8);
          break;
          label483:
          i = 8;
          break label346;
          label490:
          localb.kkM.setBackgroundResource(R.g.aZN);
          break label378;
          label504:
          localb.iiK.setPadding(localb.iiK.getPaddingLeft(), localb.iiK.getPaddingTop(), (int)BrandServiceSortView.this.getContext().getResources().getDimension(R.f.aSg), localb.iiK.getPaddingBottom());
        }
      }
    };
    GMTrace.o(10901566521344L, 81223);
    return local2;
  }
  
  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(15571538149376L, 116017);
    if (paramMotionEvent.getAction() == 0)
    {
      this.kkC = ((int)paramMotionEvent.getRawX());
      this.kkD = ((int)paramMotionEvent.getRawY());
    }
    boolean bool = super.dispatchTouchEvent(paramMotionEvent);
    GMTrace.o(15571538149376L, 116017);
    return bool;
  }
  
  public final ListView getListView()
  {
    GMTrace.i(10901298085888L, 81221);
    this.kls = ((ListView)findViewById(R.h.bTS));
    if (this.klM == null)
    {
      this.klM = inflate(getContext(), R.i.cRy, null);
      if ((this.kls != null) && (this.klM != null))
      {
        this.klN = ((TextView)this.klM.findViewById(R.h.bzn));
        this.kls.addFooterView(this.klM, null, false);
      }
    }
    ListView localListView = this.kls;
    GMTrace.o(10901298085888L, 81221);
    return localListView;
  }
  
  public final View inflate()
  {
    GMTrace.i(10901029650432L, 81219);
    View localView = View.inflate(getContext(), R.i.cNL, this);
    GMTrace.o(10901029650432L, 81219);
    return localView;
  }
  
  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    GMTrace.i(10901969174528L, 81226);
    if (paramContextMenuInfo == null)
    {
      w.i("MicroMsg.BrandServiceSortView", "menuInfo is null.");
      GMTrace.o(10901969174528L, 81226);
      return;
    }
    w.i("MicroMsg.BrandServiceSortView", "onCreateContextMenu");
    paramContextMenuInfo = (AdapterView.AdapterContextMenuInfo)paramContextMenuInfo;
    paramView = (f)((AdapterView)paramView).getItemAtPosition(paramContextMenuInfo.position);
    if ((paramView == null) || (paramView.data == null))
    {
      w.i("MicroMsg.BrandServiceSortView", "SortEntity(%s) is null or its data is null.", new Object[] { paramView });
      GMTrace.o(10901969174528L, 81226);
      return;
    }
    paramView = ((b)paramView.data).jqN;
    if (paramView == null)
    {
      w.e("MicroMsg.BrandServiceSortView", "onCreateContextMenu, contact is null");
      GMTrace.o(10901969174528L, 81226);
      return;
    }
    this.jqc = paramView.field_username;
    String str = paramView.vq();
    paramContextMenu.setHeaderTitle(com.tencent.mm.pluginsdk.ui.d.h.a(getContext(), str));
    paramView = com.tencent.mm.ae.f.iv(paramView.field_username);
    if ((paramView != null) && (!paramView.ED())) {
      paramContextMenu.add(paramContextMenuInfo.position, 0, 0, R.l.emY);
    }
    GMTrace.o(10901969174528L, 81226);
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(10902371827712L, 81229);
    if (this.klK != null) {
      this.klK.ahM();
    }
    if (super.onInterceptTouchEvent(paramMotionEvent))
    {
      GMTrace.o(10902371827712L, 81229);
      return true;
    }
    GMTrace.o(10902371827712L, 81229);
    return false;
  }
  
  public boolean onItemLongClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    GMTrace.i(10901834956800L, 81225);
    this.kkG.wTD = paramView;
    this.kkG.a(paramAdapterView, paramInt, paramLong, this, this.klO, this.kkC, this.kkD);
    GMTrace.o(10901834956800L, 81225);
    return true;
  }
  
  public final void refresh()
  {
    GMTrace.i(10900626997248L, 81216);
    this.klH.init();
    Object localObject = this.klH;
    ArrayList localArrayList;
    int i;
    label67:
    f localf;
    int j;
    switch (this.klI)
    {
    default: 
      localObject = ((com.tencent.mm.plugin.brandservice.a.d)localObject).kiU;
      if (localObject == null) {
        break label244;
      }
      localArrayList = new ArrayList();
      i = 0;
      if (i >= ((List)localObject).size()) {
        break label220;
      }
      b localb = (b)((List)localObject).get(i);
      if ((localb != null) && (localb.jqN != null))
      {
        localf = new f();
        localf.data = localb;
        int k = localb.jqN.field_showHead;
        j = k;
        if (k >= 97)
        {
          j = k;
          if (k <= 122) {
            j = k - 32;
          }
        }
        if ((j < 65) || (j > 90)) {
          break label209;
        }
      }
      break;
    }
    label209:
    for (localf.klX = ((char)j);; localf.klX = "#")
    {
      localArrayList.add(localf);
      i += 1;
      break label67;
      localObject = ((com.tencent.mm.plugin.brandservice.a.d)localObject).kiT;
      break;
    }
    label220:
    label244:
    for (localObject = localArrayList;; localObject = null)
    {
      X((List)localObject);
      super.refresh();
      GMTrace.o(10900626997248L, 81216);
      return;
    }
  }
  
  public final void release()
  {
    GMTrace.i(10900761214976L, 81217);
    if (ap.AV()) {
      com.tencent.mm.ae.x.FM().Fy();
    }
    Object localObject1 = this.klH;
    if (this == null)
    {
      w.w("MicroMsg.BrandService.BrandServiceMgr", "removeListener:onChange is null");
      ((com.tencent.mm.plugin.brandservice.a.d)localObject1).kiR.remove(null);
    }
    Object localObject2 = this.klH;
    ap.wT().b(387, (com.tencent.mm.ac.e)localObject2);
    if (((com.tencent.mm.plugin.brandservice.a.d)localObject2).kiS)
    {
      localObject1 = new ArrayList(((com.tencent.mm.plugin.brandservice.a.d)localObject2).kiT.size() + ((com.tencent.mm.plugin.brandservice.a.d)localObject2).kiU.size());
      Iterator localIterator = ((com.tencent.mm.plugin.brandservice.a.d)localObject2).kiT.iterator();
      while (localIterator.hasNext()) {
        ((List)localObject1).add((b)localIterator.next());
      }
      localObject2 = ((com.tencent.mm.plugin.brandservice.a.d)localObject2).kiU.iterator();
      while (((Iterator)localObject2).hasNext()) {
        ((List)localObject1).add((b)((Iterator)localObject2).next());
      }
      ap.wT().a(new k((List)localObject1), 0);
    }
    GMTrace.o(10900761214976L, 81217);
  }
  
  public static abstract interface a
  {
    public abstract boolean ahM();
  }
  
  public static final class b
    implements m.a.a
  {
    static Bitmap klR;
    String iconUrl;
    public View iiK;
    ImageView iiL;
    TextView kfQ;
    public TextView kjl;
    ImageView kkL;
    View kkM;
    String username;
    
    static
    {
      GMTrace.i(10893781893120L, 81165);
      klR = null;
      GMTrace.o(10893781893120L, 81165);
    }
    
    public b()
    {
      GMTrace.i(10893379239936L, 81162);
      com.tencent.mm.ae.x.FM().a(this);
      GMTrace.o(10893379239936L, 81162);
    }
    
    public final void ahZ()
    {
      GMTrace.i(10893513457664L, 81163);
      if (this.iiL == null)
      {
        GMTrace.o(10893513457664L, 81163);
        return;
      }
      Bitmap localBitmap = m.d(this.username, this.iconUrl, 0);
      if (localBitmap != null)
      {
        if ((bg.mZ(this.username)) || (this.iiL.getTag() == null))
        {
          w.e("MicroMsg.BrandServiceSortView", "error in refreshAvatar, %s", new Object[] { this.username });
          GMTrace.o(10893513457664L, 81163);
          return;
        }
        if (this.username.equals(this.iiL.getTag()))
        {
          this.iiL.setImageBitmap(localBitmap);
          GMTrace.o(10893513457664L, 81163);
        }
      }
      else
      {
        this.iiL.setImageResource(R.g.aWK);
      }
      GMTrace.o(10893513457664L, 81163);
    }
    
    public final void iL(String paramString)
    {
      GMTrace.i(10893647675392L, 81164);
      if ((paramString != null) && (paramString.equals(this.username))) {
        com.tencent.mm.sdk.platformtools.af.u(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(10892976586752L, 81159);
            BrandServiceSortView.b.this.ahZ();
            GMTrace.o(10892976586752L, 81159);
          }
        });
      }
      GMTrace.o(10893647675392L, 81164);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/brandservice/ui/base/BrandServiceSortView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */