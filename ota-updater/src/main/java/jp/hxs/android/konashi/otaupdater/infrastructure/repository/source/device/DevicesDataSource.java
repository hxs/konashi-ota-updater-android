package jp.hxs.android.konashi.otaupdater.infrastructure.repository.source.device;

import jp.hxs.android.konashi.otaupdater.domain.entity.Device;
import rx.Observable;

/**
 * Created by izumin on 5/4/2016 AD.
 */
public interface DevicesDataSource {
    Observable<Device> scan();
}