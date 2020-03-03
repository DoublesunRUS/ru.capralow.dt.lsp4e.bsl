package ru.capralow.dt.lsp4e.bsl.plugin.internal.ui;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.URIUtil;
import org.eclipse.lsp4e.server.ProcessStreamConnectionProvider;
import org.osgi.framework.Bundle;

public class BslConnectionProvider extends ProcessStreamConnectionProvider {

	public BslConnectionProvider() {
		Bundle bundle = Lsp4eBslPlugin.getDefault().getBundle();

		try {
			URL bslBundleURL = FileLocator.find(bundle, new Path("bsl-language-server.jar"), null);
			URL bslURL = FileLocator.toFileURL(bslBundleURL);

			File bslFile = URIUtil.toFile(URIUtil.toURI(bslURL));

			List<String> commands = new ArrayList<>();
			commands.add("java");
			commands.add("-jar");
			commands.add(bslFile.getAbsolutePath());
			setCommands(commands);
			setWorkingDirectory(Platform.getLocation().toOSString());

		} catch (IOException | URISyntaxException e) {
			Lsp4eBslPlugin.log(Lsp4eBslPlugin.createErrorStatus("Bsl Language Server Error", e));

		}
	}

	@Override
	public String toString() {
		return "Bsl Language Server: " + super.toString();
	}

}
