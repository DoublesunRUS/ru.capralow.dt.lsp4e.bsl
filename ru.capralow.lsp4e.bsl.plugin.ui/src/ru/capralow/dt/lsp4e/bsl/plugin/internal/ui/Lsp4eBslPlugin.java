package ru.capralow.dt.lsp4e.bsl.plugin.internal.ui;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

public class Lsp4eBslPlugin extends AbstractUIPlugin {
	public static final String ID = "ru.capralow.dt.lsp4e.bsl.plugin.ui"; //$NON-NLS-1$
	private static Lsp4eBslPlugin plugin;

	public static IStatus createErrorStatus(String message) {
		return new Status(IStatus.ERROR, ID, 0, message, (Throwable) null);
	}

	public static IStatus createErrorStatus(String message, int code) {
		return new Status(IStatus.ERROR, ID, code, message, (Throwable) null);
	}

	public static IStatus createErrorStatus(String message, int code, Throwable throwable) {
		return new Status(IStatus.ERROR, ID, code, message, throwable);
	}

	public static IStatus createErrorStatus(String message, Throwable throwable) {
		return new Status(IStatus.ERROR, ID, 0, message, throwable);
	}

	public static IStatus createInfoStatus(String message) {
		return new Status(IStatus.INFO, ID, 0, message, (Throwable) null);
	}

	public static Lsp4eBslPlugin getDefault() {
		return plugin;
	}

	public static void log(IStatus status) {
		getDefault().getLog().log(status);
	}

	@Override
	public void start(BundleContext bundleContext) throws Exception {
		super.start(bundleContext);
		plugin = this;
	}

	@Override
	public void stop(BundleContext bundleContext) throws Exception {
		plugin = null;
		super.stop(bundleContext);
	}
}
