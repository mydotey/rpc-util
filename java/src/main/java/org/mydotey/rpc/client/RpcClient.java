package org.mydotey.rpc.client;

import java.io.Closeable;
import java.util.concurrent.CompletableFuture;

/**
 * @author koqizhao
 *
 * Nov 6, 2018
 */
public interface RpcClient extends Closeable {

    <Req, Res> Res invoke(String procedure, Req request, Class<Res> clazz);

    <Req, Res> CompletableFuture<Res> invokeAsync(String procedure, Req request, Class<Res> clazz);

}
