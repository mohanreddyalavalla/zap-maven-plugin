package br.com.softplan.security.zap.api.analysis;

import br.com.softplan.security.zap.api.model.AnalysisInfo;
import br.com.softplan.security.zap.api.report.ZapReport;
import br.com.softplan.security.zap.zaproxy.clientapi.core.ClientApi;

public class WithSpiderAnalyzer extends BaseAnalyzer {

	public WithSpiderAnalyzer(String apiKey, ClientApi api) {
		super(apiKey, api);
	}

	public ZapReport analyze(AnalysisInfo analysisInfo) {
		init(analysisInfo.getAnalysisTimeoutInMillis());
		
		runSpider(analysisInfo);
		runActiveScan(analysisInfo);

		return generateReport();
	}
	
}
