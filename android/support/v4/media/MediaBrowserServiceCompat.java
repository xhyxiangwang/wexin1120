package android.support.v4.media;

import android.app.Service;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.e.a;
import android.support.v4.media.session.MediaSessionCompat.Token;
import android.support.v4.os.ResultReceiver;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public abstract class MediaBrowserServiceCompat
  extends Service
{
  private final a<IBinder, b> tB = new a();
  private final f tC = new f((byte)0);
  MediaSessionCompat.Token tD;
  
  public abstract a bw();
  
  public static final class a
  {
    final Bundle mExtras;
    final String tJ;
  }
  
  private final class b
  {
    String tK;
    Bundle tL;
    MediaBrowserServiceCompat.d tM;
    MediaBrowserServiceCompat.a tN;
    HashMap<String, List<Bundle>> tO = new HashMap();
    
    public b() {}
  }
  
  public static class c<T>
  {
    Object tP;
    private boolean tQ;
    boolean tR;
    int tz;
    
    c(Object paramObject)
    {
      this.tP = paramObject;
    }
    
    void a(T paramT, int paramInt) {}
    
    final boolean isDone()
    {
      return (this.tQ) || (this.tR);
    }
  }
  
  private static abstract interface d
  {
    public abstract void a(String paramString, MediaSessionCompat.Token paramToken, Bundle paramBundle);
    
    public abstract void a(String paramString, List<MediaBrowserCompat.MediaItem> paramList, Bundle paramBundle);
    
    public abstract IBinder asBinder();
    
    public abstract void bx();
  }
  
  private final class e
    implements MediaBrowserServiceCompat.d
  {
    final Messenger tS;
    
    e(Messenger paramMessenger)
    {
      this.tS = paramMessenger;
    }
    
    private void a(int paramInt, Bundle paramBundle)
    {
      Message localMessage = Message.obtain();
      localMessage.what = paramInt;
      localMessage.arg1 = 1;
      localMessage.setData(paramBundle);
      this.tS.send(localMessage);
    }
    
    public final void a(String paramString, MediaSessionCompat.Token paramToken, Bundle paramBundle)
    {
      Bundle localBundle = paramBundle;
      if (paramBundle == null) {
        localBundle = new Bundle();
      }
      localBundle.putInt("extra_service_version", 1);
      paramBundle = new Bundle();
      paramBundle.putString("data_media_item_id", paramString);
      paramBundle.putParcelable("data_media_session_token", paramToken);
      paramBundle.putBundle("data_root_hints", localBundle);
      a(1, paramBundle);
    }
    
    public final void a(String paramString, List<MediaBrowserCompat.MediaItem> paramList, Bundle paramBundle)
    {
      Bundle localBundle = new Bundle();
      localBundle.putString("data_media_item_id", paramString);
      localBundle.putBundle("data_options", paramBundle);
      if (paramList != null) {
        if (!(paramList instanceof ArrayList)) {
          break label57;
        }
      }
      label57:
      for (paramString = (ArrayList)paramList;; paramString = new ArrayList(paramList))
      {
        localBundle.putParcelableArrayList("data_media_item_list", paramString);
        a(3, localBundle);
        return;
      }
    }
    
    public final IBinder asBinder()
    {
      return this.tS.getBinder();
    }
    
    public final void bx()
    {
      a(2, null);
    }
  }
  
  private final class f
    extends Handler
  {
    private final MediaBrowserServiceCompat.g tT = new MediaBrowserServiceCompat.g(MediaBrowserServiceCompat.this);
    
    private f() {}
    
    private void b(Runnable paramRunnable)
    {
      if (Thread.currentThread() == getLooper().getThread())
      {
        paramRunnable.run();
        return;
      }
      post(paramRunnable);
    }
    
    public final void handleMessage(Message paramMessage)
    {
      Object localObject1 = paramMessage.getData();
      switch (paramMessage.what)
      {
      default: 
        new StringBuilder("Unhandled message: ").append(paramMessage).append("\n  Service version: 1\n  Client version: ").append(paramMessage.arg1);
      case 1: 
      case 2: 
      case 3: 
      case 4: 
      case 5: 
        Object localObject2;
        do
        {
          return;
          localObject2 = this.tT;
          String str = ((Bundle)localObject1).getString("data_package_name");
          int i = ((Bundle)localObject1).getInt("data_calling_uid");
          localObject1 = ((Bundle)localObject1).getBundle("data_root_hints");
          paramMessage = new MediaBrowserServiceCompat.e(MediaBrowserServiceCompat.this, paramMessage.replyTo);
          if (!MediaBrowserServiceCompat.a(((MediaBrowserServiceCompat.g)localObject2).tH, str, i)) {
            throw new IllegalArgumentException("Package/uid mismatch: uid=" + i + " package=" + str);
          }
          MediaBrowserServiceCompat.a(((MediaBrowserServiceCompat.g)localObject2).tH).b(new MediaBrowserServiceCompat.g.1((MediaBrowserServiceCompat.g)localObject2, paramMessage, str, (Bundle)localObject1, i));
          return;
          localObject1 = this.tT;
          paramMessage = new MediaBrowserServiceCompat.e(MediaBrowserServiceCompat.this, paramMessage.replyTo);
          MediaBrowserServiceCompat.a(((MediaBrowserServiceCompat.g)localObject1).tH).b(new MediaBrowserServiceCompat.g.2((MediaBrowserServiceCompat.g)localObject1, paramMessage));
          return;
          localObject2 = this.tT;
          str = ((Bundle)localObject1).getString("data_media_item_id");
          localObject1 = ((Bundle)localObject1).getBundle("data_options");
          paramMessage = new MediaBrowserServiceCompat.e(MediaBrowserServiceCompat.this, paramMessage.replyTo);
          MediaBrowserServiceCompat.a(((MediaBrowserServiceCompat.g)localObject2).tH).b(new MediaBrowserServiceCompat.g.3((MediaBrowserServiceCompat.g)localObject2, paramMessage, str, (Bundle)localObject1));
          return;
          localObject2 = this.tT;
          str = ((Bundle)localObject1).getString("data_media_item_id");
          localObject1 = ((Bundle)localObject1).getBundle("data_options");
          paramMessage = new MediaBrowserServiceCompat.e(MediaBrowserServiceCompat.this, paramMessage.replyTo);
          MediaBrowserServiceCompat.a(((MediaBrowserServiceCompat.g)localObject2).tH).b(new MediaBrowserServiceCompat.g.4((MediaBrowserServiceCompat.g)localObject2, paramMessage, str, (Bundle)localObject1));
          return;
          paramMessage = this.tT;
          localObject2 = ((Bundle)localObject1).getString("data_media_item_id");
          localObject1 = (ResultReceiver)((Bundle)localObject1).getParcelable("data_result_receiver");
        } while ((TextUtils.isEmpty((CharSequence)localObject2)) || (localObject1 == null));
        MediaBrowserServiceCompat.a(paramMessage.tH).b(new MediaBrowserServiceCompat.g.5(paramMessage, (String)localObject2, (ResultReceiver)localObject1));
        return;
      case 6: 
        localObject1 = this.tT;
        paramMessage = new MediaBrowserServiceCompat.e(MediaBrowserServiceCompat.this, paramMessage.replyTo);
        MediaBrowserServiceCompat.a(((MediaBrowserServiceCompat.g)localObject1).tH).b(new MediaBrowserServiceCompat.g.6((MediaBrowserServiceCompat.g)localObject1, paramMessage));
        return;
      }
      localObject1 = this.tT;
      paramMessage = new MediaBrowserServiceCompat.e(MediaBrowserServiceCompat.this, paramMessage.replyTo);
      MediaBrowserServiceCompat.a(((MediaBrowserServiceCompat.g)localObject1).tH).b(new MediaBrowserServiceCompat.g.7((MediaBrowserServiceCompat.g)localObject1, paramMessage));
    }
    
    public final boolean sendMessageAtTime(Message paramMessage, long paramLong)
    {
      Bundle localBundle = paramMessage.getData();
      localBundle.setClassLoader(MediaBrowserCompat.class.getClassLoader());
      localBundle.putInt("data_calling_uid", Binder.getCallingUid());
      return super.sendMessageAtTime(paramMessage, paramLong);
    }
  }
  
  private final class g
  {
    public g() {}
  }
  
  private class h {}
  
  private final class i
    extends MediaBrowserServiceCompat.h
  {}
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/android/support/v4/media/MediaBrowserServiceCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */