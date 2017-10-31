package com.tencent.mm.plugin.brandservice.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.util.AttributeSet;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.widget.AdapterView;
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
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.k;
import com.tencent.mm.ac.n;
import com.tencent.mm.ae.m.a;
import com.tencent.mm.g.b.af;
import com.tencent.mm.plugin.brandservice.a.b;
import com.tencent.mm.plugin.brandservice.ui.base.BaseSortView;
import com.tencent.mm.pluginsdk.i;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.protocal.c.and;
import com.tencent.mm.protocal.c.auv;
import com.tencent.mm.protocal.c.bgc;
import com.tencent.mm.protocal.c.bgd;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.p;
import com.tencent.mm.ui.base.VerticalScrollBar;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.o.d;
import com.tencent.mm.ui.base.q;
import com.tencent.mm.ui.widget.g;
import com.tencent.mm.x.ap;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EnterpriseBizContactListView
  extends BaseSortView
{
  b kkA;
  private a kkB;
  private int kkC;
  private int kkD;
  String kkq;
  boolean kkx;
  private ListView kky;
  int kkz;
  
  public EnterpriseBizContactListView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(10862509162496L, 80932);
    this.kkz = -1;
    this.kkC = 0;
    this.kkD = 0;
    GMTrace.o(10862509162496L, 80932);
  }
  
  public static void release()
  {
    GMTrace.i(10862911815680L, 80935);
    com.tencent.mm.ae.x.FM().Fy();
    GMTrace.o(10862911815680L, 80935);
  }
  
  public final boolean a(String paramString, com.tencent.mm.plugin.brandservice.ui.base.f paramf)
  {
    GMTrace.i(10863046033408L, 80936);
    if ((!bg.mZ(paramString)) && (paramf != null))
    {
      Object localObject = (b)paramf.data;
      if (localObject == null)
      {
        GMTrace.o(10863046033408L, 80936);
        return false;
      }
      paramf = ((b)localObject).jqN.vq();
      String str = ((b)localObject).jqN.qW();
      localObject = ((b)localObject).jqN.qX();
      paramString = paramString.toUpperCase();
      if (((!bg.mZ(paramf)) && (paramf.toUpperCase().indexOf(paramString) != -1)) || ((!bg.mZ(str)) && (str.toUpperCase().indexOf(paramString) != -1)) || ((!bg.mZ((String)localObject)) && (((String)localObject).toUpperCase().startsWith(paramString))))
      {
        GMTrace.o(10863046033408L, 80936);
        return true;
      }
    }
    GMTrace.o(10863046033408L, 80936);
    return false;
  }
  
  public final void ahN()
  {
    GMTrace.i(10862777597952L, 80934);
    this.WK = new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(10866267258880L, 80960);
        paramAnonymousAdapterView = paramAnonymousView.getTag();
        if ((paramAnonymousAdapterView == null) || (!(paramAnonymousAdapterView instanceof EnterpriseBizContactListView.c)))
        {
          GMTrace.o(10866267258880L, 80960);
          return;
        }
        EnterpriseBizContactListView.c localc = (EnterpriseBizContactListView.c)paramAnonymousAdapterView;
        if (bg.mZ(localc.username))
        {
          GMTrace.o(10866267258880L, 80960);
          return;
        }
        boolean bool1 = com.tencent.mm.ae.f.iB(localc.username);
        boolean bool2 = com.tencent.mm.ae.f.dG(localc.username);
        com.tencent.mm.ae.d locald = com.tencent.mm.ae.f.iv(localc.username);
        if (locald == null) {}
        for (paramAnonymousAdapterView = null;; paramAnonymousAdapterView = locald.EI())
        {
          paramAnonymousView = paramAnonymousAdapterView;
          if (paramAnonymousAdapterView == null) {
            paramAnonymousView = "";
          }
          if (!bool1) {
            break;
          }
          paramAnonymousAdapterView = new Intent();
          paramAnonymousAdapterView.putExtra("rawUrl", paramAnonymousView);
          paramAnonymousAdapterView.putExtra("useJs", true);
          paramAnonymousAdapterView.putExtra("srcUsername", localc.username);
          paramAnonymousAdapterView.putExtra("bizofstartfrom", "enterpriseHomeSubBrand");
          paramAnonymousAdapterView.addFlags(67108864);
          com.tencent.mm.bi.d.b(EnterpriseBizContactListView.this.getContext(), "webview", ".ui.tools.WebViewUI", paramAnonymousAdapterView);
          EnterpriseBizContactListView.a(EnterpriseBizContactListView.this, locald, 2);
          GMTrace.o(10866267258880L, 80960);
          return;
        }
        if (bool2)
        {
          paramAnonymousAdapterView = new Intent();
          paramAnonymousAdapterView.putExtra("Contact_User", localc.username);
          paramAnonymousAdapterView.addFlags(67108864);
          paramAnonymousAdapterView.putExtra("biz_chat_from_scene", 3);
          com.tencent.mm.bi.d.a(EnterpriseBizContactListView.this.getContext(), ".ui.bizchat.BizChatConversationUI", paramAnonymousAdapterView);
          GMTrace.o(10866267258880L, 80960);
          return;
        }
        paramAnonymousAdapterView = new Intent();
        paramAnonymousAdapterView.addFlags(67108864);
        paramAnonymousAdapterView.putExtra("finish_direct", true);
        paramAnonymousAdapterView.putExtra("Chat_User", localc.username);
        paramAnonymousAdapterView.putExtra("chat_from_scene", 2);
        paramAnonymousView = EnterpriseBizContactListView.this.getContext();
        w.i("MicroMsg.BrandService.BrandServiceApplication", "startChattingUI");
        com.tencent.mm.plugin.brandservice.a.ifM.e(paramAnonymousAdapterView, paramAnonymousView);
        EnterpriseBizContactListView.a(EnterpriseBizContactListView.this, locald, 1);
        GMTrace.o(10866267258880L, 80960);
      }
    };
    if (this.mMode == 0) {
      this.klv = new AdapterView.OnItemLongClickListener()
      {
        public final boolean onItemLongClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
        {
          GMTrace.i(10891634409472L, 81149);
          if (EnterpriseBizContactListView.a(EnterpriseBizContactListView.this) == null) {
            EnterpriseBizContactListView.a(EnterpriseBizContactListView.this, new EnterpriseBizContactListView.a(EnterpriseBizContactListView.this));
          }
          EnterpriseBizContactListView.a locala = EnterpriseBizContactListView.a(EnterpriseBizContactListView.this);
          int i = EnterpriseBizContactListView.b(EnterpriseBizContactListView.this);
          int j = EnterpriseBizContactListView.c(EnterpriseBizContactListView.this);
          if (locala.kkG == null)
          {
            localObject = (EnterpriseBizContactListView)locala.kkH.get();
            if (localObject == null)
            {
              GMTrace.o(10891634409472L, 81149);
              return false;
            }
            locala.kkG = new g(((EnterpriseBizContactListView)localObject).getContext());
          }
          Object localObject = paramAnonymousView.getTag();
          if ((localObject == null) || (!(localObject instanceof EnterpriseBizContactListView.c)))
          {
            GMTrace.o(10891634409472L, 81149);
            return false;
          }
          locala.kkF = ((EnterpriseBizContactListView.c)localObject).username;
          if ((bg.mZ(locala.kkF)) || (com.tencent.mm.ae.f.dG(locala.kkF)))
          {
            GMTrace.o(10891634409472L, 81149);
            return false;
          }
          locala.kkG.wTD = paramAnonymousView;
          locala.kkG.a(paramAnonymousAdapterView, paramAnonymousInt, paramAnonymousLong, new EnterpriseBizContactListView.a.1(locala, paramAnonymousInt), new EnterpriseBizContactListView.a.2(locala), i, j);
          GMTrace.o(10891634409472L, 81149);
          return true;
        }
      };
    }
    GMTrace.o(10862777597952L, 80934);
  }
  
  public final VerticalScrollBar ahO()
  {
    GMTrace.i(10863314468864L, 80938);
    VerticalScrollBar localVerticalScrollBar = (VerticalScrollBar)findViewById(R.h.cyc);
    GMTrace.o(10863314468864L, 80938);
    return localVerticalScrollBar;
  }
  
  public final View ahP()
  {
    GMTrace.i(10863582904320L, 80940);
    TextView localTextView = (TextView)findViewById(R.h.cgA);
    localTextView.setText(R.l.dTo);
    GMTrace.o(10863582904320L, 80940);
    return localTextView;
  }
  
  public final com.tencent.mm.plugin.brandservice.ui.base.e.a ahQ()
  {
    GMTrace.i(10863717122048L, 80941);
    com.tencent.mm.plugin.brandservice.ui.base.e.a local3 = new com.tencent.mm.plugin.brandservice.ui.base.e.a()
    {
      public final View a(com.tencent.mm.plugin.brandservice.ui.base.f paramAnonymousf, View paramAnonymousView, boolean paramAnonymousBoolean1, boolean paramAnonymousBoolean2)
      {
        GMTrace.i(10884252434432L, 81094);
        long l = bg.Pq();
        Context localContext = EnterpriseBizContactListView.this.getContext();
        EnterpriseBizContactListView.c localc;
        if (paramAnonymousView == null)
        {
          paramAnonymousView = LayoutInflater.from(localContext).inflate(R.i.cSP, null);
          localc = new EnterpriseBizContactListView.c();
          localc.kjl = ((TextView)paramAnonymousView.findViewById(R.h.brA));
          localc.iiK = paramAnonymousView.findViewById(R.h.byZ);
          localc.iiL = ((ImageView)paramAnonymousView.findViewById(R.h.bie));
          localc.kkL = ((ImageView)paramAnonymousView.findViewById(R.h.cfY));
          localc.kfQ = ((TextView)paramAnonymousView.findViewById(R.h.bnC));
          localc.kkM = paramAnonymousView.findViewById(R.h.cvb);
          paramAnonymousView.setTag(localc);
        }
        b localb;
        for (;;)
        {
          localb = (b)paramAnonymousf.data;
          if (localb != null) {
            break;
          }
          w.e("MicroMsg.BrandService.EnterpriseBizContactListView", "should not be empty");
          GMTrace.o(10884252434432L, 81094);
          return paramAnonymousView;
          localc = (EnterpriseBizContactListView.c)paramAnonymousView.getTag();
        }
        int i = 0;
        if (localb.kiP.EG()) {
          i = 1;
        }
        if ((EnterpriseBizContactListView.this.klx) && (paramAnonymousBoolean1)) {
          if (paramAnonymousf.klX.equals("!2"))
          {
            localc.kjl.setText(EnterpriseBizContactListView.this.getContext().getString(R.l.dTt));
            localc.kjl.setVisibility(0);
            if (i == 0) {
              break label534;
            }
            localc.username = localb.userName;
            localc.iiL.setImageResource(R.k.dnY);
            paramAnonymousf = EnterpriseBizContactListView.this.getResources().getString(R.l.dTb);
            EnterpriseBizContactListView.a(localc.kfQ, localContext, paramAnonymousf, (int)localc.kfQ.getTextSize());
            label314:
            w.v("MicroMsg.BrandService.EnterpriseBizContactListView", "bizinfo status%d", new Object[] { Integer.valueOf(localb.kiP.field_status) });
            paramAnonymousf = localc.kkL;
            if (localb.kiP.field_status != 1) {
              break label615;
            }
            i = 0;
            label360:
            paramAnonymousf.setVisibility(i);
            if ((EnterpriseBizContactListView.this.mMode != 0) || (!paramAnonymousBoolean2)) {
              break label622;
            }
            localc.kkM.setBackgroundResource(R.g.aYd);
            label392:
            if (!EnterpriseBizContactListView.this.kly) {
              break label636;
            }
            localc.iiK.setPadding(localc.iiK.getPaddingLeft(), localc.iiK.getPaddingTop(), (int)EnterpriseBizContactListView.this.getContext().getResources().getDimension(R.f.aQW), localc.iiK.getPaddingBottom());
          }
        }
        for (;;)
        {
          w.v("MicroMsg.BrandService.EnterpriseBizContactListView", "get view use %d ms", new Object[] { Long.valueOf(bg.aG(l)) });
          GMTrace.o(10884252434432L, 81094);
          return paramAnonymousView;
          if (!paramAnonymousf.klX.equals("!1"))
          {
            localc.kjl.setText(paramAnonymousf.klX);
            localc.kjl.setVisibility(0);
            break;
          }
          localc.kjl.setVisibility(8);
          break;
          label534:
          localc.username = localb.userName;
          localc.iconUrl = localb.kiP.field_brandIconURL;
          localc.iiL.setTag(localb.userName);
          a.b.a(localc.iiL, localc.username);
          paramAnonymousf = localb.jqN.vq();
          EnterpriseBizContactListView.a(localc.kfQ, localContext, paramAnonymousf, (int)localc.kfQ.getTextSize());
          break label314;
          label615:
          i = 8;
          break label360;
          label622:
          localc.kkM.setBackgroundResource(R.g.aZN);
          break label392;
          label636:
          localc.iiK.setPadding(localc.iiK.getPaddingLeft(), localc.iiK.getPaddingTop(), (int)EnterpriseBizContactListView.this.getContext().getResources().getDimension(R.f.aSg), localc.iiK.getPaddingBottom());
        }
      }
    };
    GMTrace.o(10863717122048L, 80941);
    return local3;
  }
  
  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(16256048562176L, 121117);
    if (paramMotionEvent.getAction() == 0)
    {
      this.kkC = ((int)paramMotionEvent.getRawX());
      this.kkD = ((int)paramMotionEvent.getRawY());
    }
    boolean bool = super.dispatchTouchEvent(paramMotionEvent);
    GMTrace.o(16256048562176L, 121117);
    return bool;
  }
  
  public final ListView getListView()
  {
    GMTrace.i(10863448686592L, 80939);
    this.kky = ((ListView)findViewById(R.h.bTS));
    ListView localListView = this.kky;
    GMTrace.o(10863448686592L, 80939);
    return localListView;
  }
  
  public final View inflate()
  {
    GMTrace.i(10863180251136L, 80937);
    View localView = View.inflate(getContext(), R.i.cSS, this);
    GMTrace.o(10863180251136L, 80937);
    return localView;
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(10863851339776L, 80942);
    if (this.kkA != null) {
      this.kkA.ahM();
    }
    if (super.onInterceptTouchEvent(paramMotionEvent))
    {
      GMTrace.o(10863851339776L, 80942);
      return true;
    }
    GMTrace.o(10863851339776L, 80942);
    return false;
  }
  
  public final void refresh()
  {
    GMTrace.i(10862643380224L, 80933);
    ArrayList localArrayList = new ArrayList();
    com.tencent.mm.ae.x.FE();
    Cursor localCursor = com.tencent.mm.ae.e.t(this.kkq, this.kkx);
    while (localCursor.moveToNext())
    {
      b localb = new b();
      Object localObject;
      if (localCursor != null)
      {
        localObject = new com.tencent.mm.storage.x();
        ((com.tencent.mm.storage.x)localObject).b(localCursor);
        com.tencent.mm.ae.d locald = new com.tencent.mm.ae.d();
        locald.b(localCursor);
        localb.userName = ((af)localObject).field_username;
        localb.jqN = ((com.tencent.mm.storage.x)localObject);
        localb.kiP = locald;
      }
      if (localb.jqN != null)
      {
        localObject = new com.tencent.mm.plugin.brandservice.ui.base.f();
        ((com.tencent.mm.plugin.brandservice.ui.base.f)localObject).data = localb;
        if (localb.kiP.EG()) {
          ((com.tencent.mm.plugin.brandservice.ui.base.f)localObject).klX = "!1";
        }
        for (;;)
        {
          localArrayList.add(localObject);
          break;
          if (localb.jqN.vl())
          {
            ((com.tencent.mm.plugin.brandservice.ui.base.f)localObject).klX = "!2";
          }
          else
          {
            int j = localb.jqN.uD();
            int i = j;
            if (j >= 97)
            {
              i = j;
              if (j <= 122) {
                i = j - 32;
              }
            }
            if ((i >= 65) && (i <= 90)) {
              ((com.tencent.mm.plugin.brandservice.ui.base.f)localObject).klX = ((char)i);
            } else {
              ((com.tencent.mm.plugin.brandservice.ui.base.f)localObject).klX = "#";
            }
          }
        }
      }
    }
    localCursor.close();
    this.kkz = localArrayList.size();
    Collections.sort(localArrayList, new d());
    X(localArrayList);
    super.refresh();
    GMTrace.o(10862643380224L, 80933);
  }
  
  private static final class a
    implements com.tencent.mm.ac.e
  {
    public q ikZ;
    public String kkF;
    g kkG;
    WeakReference<EnterpriseBizContactListView> kkH;
    
    public a(EnterpriseBizContactListView paramEnterpriseBizContactListView)
    {
      GMTrace.i(10861972291584L, 80928);
      this.kkH = new WeakReference(paramEnterpriseBizContactListView);
      GMTrace.o(10861972291584L, 80928);
    }
    
    public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
    {
      GMTrace.i(10862240727040L, 80930);
      if ((this.ikZ != null) && (this.ikZ.isShowing())) {
        this.ikZ.dismiss();
      }
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        GMTrace.o(10862240727040L, 80930);
        return;
      }
      if (paramk.getType() == 1394)
      {
        paramString = ((com.tencent.mm.plugin.profile.a.c)paramk).aVW();
        Object localObject = ((com.tencent.mm.plugin.profile.a.c)paramk).aVV();
        if ((localObject == null) || (((bgd)localObject).tBo == null) || (((bgd)localObject).tBo.ret != 0))
        {
          if ((localObject != null) && (((bgd)localObject).tBo != null))
          {
            w.w("MicroMsg.BrandService.EnterpriseBizContactListView", "chuangchen onSceneEnd type:%s, err:code:%s", new Object[] { Integer.valueOf(paramk.getType()), Integer.valueOf(((bgd)localObject).tBo.ret) });
            GMTrace.o(10862240727040L, 80930);
            return;
          }
          w.w("MicroMsg.BrandService.EnterpriseBizContactListView", "chuangchen onSceneEnd type:%s, err:resp == null", new Object[] { Integer.valueOf(paramk.getType()) });
          GMTrace.o(10862240727040L, 80930);
          return;
        }
        if (!paramString.uxY)
        {
          GMTrace.o(10862240727040L, 80930);
          return;
        }
        paramk = com.tencent.mm.ae.f.iv(paramString.tBi);
        paramk.field_brandFlag |= 0x1;
        localObject = new and();
        ((and)localObject).huX = paramk.field_brandFlag;
        ((and)localObject).jWW = paramString.tBi;
        ap.AS();
        com.tencent.mm.x.c.yK().b(new com.tencent.mm.plugin.messenger.foundation.a.a.e.a(47, (com.tencent.mm.bl.a)localObject));
        com.tencent.mm.ae.x.FE().c(paramk, new String[0]);
        ap.AS();
        com.tencent.mm.x.c.yQ().SU(paramk.field_username);
        ap.AS();
        if (com.tencent.mm.x.c.yQ().Tf(paramk.field_enterpriseFather) <= 0)
        {
          ap.AS();
          com.tencent.mm.x.c.yQ().SU(paramk.field_enterpriseFather);
        }
        for (;;)
        {
          paramString = (EnterpriseBizContactListView)this.kkH.get();
          if (paramString != null) {
            break;
          }
          GMTrace.o(10862240727040L, 80930);
          return;
          ap.AS();
          com.tencent.mm.x.c.yP().Sq(paramk.field_enterpriseFather);
        }
        paramString.refresh();
      }
      GMTrace.o(10862240727040L, 80930);
    }
    
    protected final void finalize()
    {
      GMTrace.i(10862106509312L, 80929);
      ap.wT().b(1394, this);
      super.finalize();
      GMTrace.o(10862106509312L, 80929);
    }
  }
  
  public static abstract interface b
  {
    public abstract boolean ahM();
  }
  
  public static final class c
  {
    String iconUrl;
    public View iiK;
    ImageView iiL;
    TextView kfQ;
    public TextView kjl;
    ImageView kkL;
    View kkM;
    String username;
    
    public c()
    {
      GMTrace.i(10888010530816L, 81122);
      GMTrace.o(10888010530816L, 81122);
    }
  }
  
  private final class d
    implements Comparator<com.tencent.mm.plugin.brandservice.ui.base.f>
  {
    public d()
    {
      GMTrace.i(10909753802752L, 81284);
      GMTrace.o(10909753802752L, 81284);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/brandservice/ui/EnterpriseBizContactListView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */