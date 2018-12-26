package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto conta
 **/
@ApiModel(description = "Objeto conta")
public class ContaDetalheResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idPessoa")
  private Long idPessoa = null;
  @SerializedName("nome")
  private String nome = null;
  @SerializedName("idProduto")
  private Long idProduto = null;
  @SerializedName("idOrigemComercial")
  private Long idOrigemComercial = null;
  @SerializedName("nomeOrigemComercial")
  private String nomeOrigemComercial = null;
  @SerializedName("idFantasiaBasica")
  private Long idFantasiaBasica = null;
  @SerializedName("nomeFantasiaBasica")
  private String nomeFantasiaBasica = null;
  @SerializedName("idStatusConta")
  private Long idStatusConta = null;
  @SerializedName("statusConta")
  private String statusConta = null;
  @SerializedName("diaVencimento")
  private Integer diaVencimento = null;
  @SerializedName("melhorDiaCompra")
  private Integer melhorDiaCompra = null;
  @SerializedName("dataStatusConta")
  private String dataStatusConta = null;
  @SerializedName("dataCadastro")
  private String dataCadastro = null;
  @SerializedName("dataUltimaAlteracaoVencimento")
  private String dataUltimaAlteracaoVencimento = null;
  @SerializedName("dataHoraUltimaCompra")
  private String dataHoraUltimaCompra = null;
  @SerializedName("numeroAgencia")
  private Integer numeroAgencia = null;
  @SerializedName("numeroContaCorrente")
  private String numeroContaCorrente = null;
  @SerializedName("valorRenda")
  private BigDecimal valorRenda = null;
  @SerializedName("formaEnvioFatura")
  private String formaEnvioFatura = null;
  @SerializedName("titular")
  private Boolean titular = null;
  @SerializedName("limiteGlobal")
  private BigDecimal limiteGlobal = null;
  @SerializedName("limiteSaqueGlobal")
  private BigDecimal limiteSaqueGlobal = null;
  @SerializedName("saldoDisponivelGlobal")
  private BigDecimal saldoDisponivelGlobal = null;
  @SerializedName("saldoDisponivelSaque")
  private BigDecimal saldoDisponivelSaque = null;
  @SerializedName("impedidoFinanciamento")
  private Boolean impedidoFinanciamento = null;
  @SerializedName("diasAtraso")
  private Long diasAtraso = null;
  @SerializedName("proximoVencimentoPadrao")
  private String proximoVencimentoPadrao = null;
  @SerializedName("idProposta")
  private Long idProposta = null;
  @SerializedName("quantidadePagamentos")
  private Integer quantidadePagamentos = null;
  @SerializedName("correspondencia")
  private Long correspondencia = null;
  @SerializedName("dataInicioAtraso")
  private String dataInicioAtraso = null;
  @SerializedName("rotativoPagaJuros")
  private BigDecimal rotativoPagaJuros = null;
  @SerializedName("totalPosProx")
  private BigDecimal totalPosProx = null;
  @SerializedName("saldoAtualFinal")
  private BigDecimal saldoAtualFinal = null;
  @SerializedName("saldoExtratoAnterior")
  private BigDecimal saldoExtratoAnterior = null;
  @SerializedName("aceitaNovaContaPorGrupoProduto")
  private Boolean aceitaNovaContaPorGrupoProduto = null;
  public enum FuncaoAtivaEnum {
     DEBITO_CREDITO,  CREDITO, 
  };
  @SerializedName("funcaoAtiva")
  private FuncaoAtivaEnum funcaoAtiva = null;

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o de conta (id)
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o de conta (id)")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o da Pessoa Titular da Conta (id)
   **/
  @ApiModelProperty(value = "C\u00F3digo de Identifica\u00E7\u00E3o da Pessoa Titular da Conta (id)")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * Apresenta o 'Nome Completo da PF' ou o 'Nome Completo da Raz\u00E3o Social (Nome Empresarial)'
   **/
  @ApiModelProperty(value = "Apresenta o 'Nome Completo da PF' ou o 'Nome Completo da Raz\u00E3o Social (Nome Empresarial)'")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do produto ao qual a conta faz parte. (id)
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o do produto ao qual a conta faz parte. (id)")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o da Origem Comercial (id) que deu origem a Conta
   **/
  @ApiModelProperty(value = "C\u00F3digo de Identifica\u00E7\u00E3o da Origem Comercial (id) que deu origem a Conta")
  public Long getIdOrigemComercial() {
    return idOrigemComercial;
  }
  public void setIdOrigemComercial(Long idOrigemComercial) {
    this.idOrigemComercial = idOrigemComercial;
  }

  
  /**
   * Nome da origem comercial
   **/
  @ApiModelProperty(value = "Nome da origem comercial")
  public String getNomeOrigemComercial() {
    return nomeOrigemComercial;
  }
  public void setNomeOrigemComercial(String nomeOrigemComercial) {
    this.nomeOrigemComercial = nomeOrigemComercial;
  }

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o da Fantasia Basica (id)
   **/
  @ApiModelProperty(value = "C\u00F3digo de Identifica\u00E7\u00E3o da Fantasia Basica (id)")
  public Long getIdFantasiaBasica() {
    return idFantasiaBasica;
  }
  public void setIdFantasiaBasica(Long idFantasiaBasica) {
    this.idFantasiaBasica = idFantasiaBasica;
  }

  
  /**
   * Nome da Fantasia Basica
   **/
  @ApiModelProperty(value = "Nome da Fantasia Basica")
  public String getNomeFantasiaBasica() {
    return nomeFantasiaBasica;
  }
  public void setNomeFantasiaBasica(String nomeFantasiaBasica) {
    this.nomeFantasiaBasica = nomeFantasiaBasica;
  }

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o do status atribuido a conta
   **/
  @ApiModelProperty(value = "C\u00F3digo de Identifica\u00E7\u00E3o do status atribuido a conta")
  public Long getIdStatusConta() {
    return idStatusConta;
  }
  public void setIdStatusConta(Long idStatusConta) {
    this.idStatusConta = idStatusConta;
  }

  
  /**
   * Descri\u00E7\u00E3o do status da conta
   **/
  @ApiModelProperty(value = "Descri\u00E7\u00E3o do status da conta")
  public String getStatusConta() {
    return statusConta;
  }
  public void setStatusConta(String statusConta) {
    this.statusConta = statusConta;
  }

  
  /**
   * Apresenta o dia de vencimento
   **/
  @ApiModelProperty(value = "Apresenta o dia de vencimento")
  public Integer getDiaVencimento() {
    return diaVencimento;
  }
  public void setDiaVencimento(Integer diaVencimento) {
    this.diaVencimento = diaVencimento;
  }

  
  /**
   * Apresenta o melhor dia de compra
   **/
  @ApiModelProperty(value = "Apresenta o melhor dia de compra")
  public Integer getMelhorDiaCompra() {
    return melhorDiaCompra;
  }
  public void setMelhorDiaCompra(Integer melhorDiaCompra) {
    this.melhorDiaCompra = melhorDiaCompra;
  }

  
  /**
   * Apresenta a data em que o idStatusConta atual fora atribu\u00EDdo para ela
   **/
  @ApiModelProperty(value = "Apresenta a data em que o idStatusConta atual fora atribu\u00EDdo para ela")
  public String getDataStatusConta() {
    return dataStatusConta;
  }
  public void setDataStatusConta(String dataStatusConta) {
    this.dataStatusConta = dataStatusConta;
  }

  
  /**
   * Apresenta a data em que o cart\u00E3o foi gerado
   **/
  @ApiModelProperty(value = "Apresenta a data em que o cart\u00E3o foi gerado")
  public String getDataCadastro() {
    return dataCadastro;
  }
  public void setDataCadastro(String dataCadastro) {
    this.dataCadastro = dataCadastro;
  }

  
  /**
   * Apresenta a data da ultima altera\u00E7\u00E3o de vencimento
   **/
  @ApiModelProperty(value = "Apresenta a data da ultima altera\u00E7\u00E3o de vencimento")
  public String getDataUltimaAlteracaoVencimento() {
    return dataUltimaAlteracaoVencimento;
  }
  public void setDataUltimaAlteracaoVencimento(String dataUltimaAlteracaoVencimento) {
    this.dataUltimaAlteracaoVencimento = dataUltimaAlteracaoVencimento;
  }

  
  /**
   * Apresenta a data da ultima altera\u00E7\u00E3o de vencimento
   **/
  @ApiModelProperty(value = "Apresenta a data da ultima altera\u00E7\u00E3o de vencimento")
  public String getDataHoraUltimaCompra() {
    return dataHoraUltimaCompra;
  }
  public void setDataHoraUltimaCompra(String dataHoraUltimaCompra) {
    this.dataHoraUltimaCompra = dataHoraUltimaCompra;
  }

  
  /**
   * N\u00FAmero da ag\u00EAncia
   **/
  @ApiModelProperty(value = "N\u00FAmero da ag\u00EAncia")
  public Integer getNumeroAgencia() {
    return numeroAgencia;
  }
  public void setNumeroAgencia(Integer numeroAgencia) {
    this.numeroAgencia = numeroAgencia;
  }

  
  /**
   * N\u00FAmero da conta corrente
   **/
  @ApiModelProperty(value = "N\u00FAmero da conta corrente")
  public String getNumeroContaCorrente() {
    return numeroContaCorrente;
  }
  public void setNumeroContaCorrente(String numeroContaCorrente) {
    this.numeroContaCorrente = numeroContaCorrente;
  }

  
  /**
   * Valor da renda comprovada
   **/
  @ApiModelProperty(value = "Valor da renda comprovada")
  public BigDecimal getValorRenda() {
    return valorRenda;
  }
  public void setValorRenda(BigDecimal valorRenda) {
    this.valorRenda = valorRenda;
  }

  
  /**
   * Forma de envio da fatura
   **/
  @ApiModelProperty(value = "Forma de envio da fatura")
  public String getFormaEnvioFatura() {
    return formaEnvioFatura;
  }
  public void setFormaEnvioFatura(String formaEnvioFatura) {
    this.formaEnvioFatura = formaEnvioFatura;
  }

  
  /**
   * Apresenta se a pessoa \u00E9 titular da conta
   **/
  @ApiModelProperty(value = "Apresenta se a pessoa \u00E9 titular da conta")
  public Boolean getTitular() {
    return titular;
  }
  public void setTitular(Boolean titular) {
    this.titular = titular;
  }

  
  /**
   * Apresenta o valor do limite de cr\u00E9dito que o portador do cart\u00E3o possui
   **/
  @ApiModelProperty(value = "Apresenta o valor do limite de cr\u00E9dito que o portador do cart\u00E3o possui")
  public BigDecimal getLimiteGlobal() {
    return limiteGlobal;
  }
  public void setLimiteGlobal(BigDecimal limiteGlobal) {
    this.limiteGlobal = limiteGlobal;
  }

  
  /**
   * Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00E9dito que o portador pode utilizar para realizar transa\u00E7\u00F5es de Saque Nacional
   **/
  @ApiModelProperty(value = "Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00E9dito que o portador pode utilizar para realizar transa\u00E7\u00F5es de Saque Nacional")
  public BigDecimal getLimiteSaqueGlobal() {
    return limiteSaqueGlobal;
  }
  public void setLimiteSaqueGlobal(BigDecimal limiteSaqueGlobal) {
    this.limiteSaqueGlobal = limiteSaqueGlobal;
  }

  
  /**
   * Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00E9dito que o portador possui para uso exclusivo em Compras Nacionais
   **/
  @ApiModelProperty(value = "Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00E9dito que o portador possui para uso exclusivo em Compras Nacionais")
  public BigDecimal getSaldoDisponivelGlobal() {
    return saldoDisponivelGlobal;
  }
  public void setSaldoDisponivelGlobal(BigDecimal saldoDisponivelGlobal) {
    this.saldoDisponivelGlobal = saldoDisponivelGlobal;
  }

  
  /**
   * Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00E9dito que o portador pode utilizar para realizar transa\u00E7\u00F5es de Saque Nacional dentro de cada ciclo de faturamento
   **/
  @ApiModelProperty(value = "Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00E9dito que o portador pode utilizar para realizar transa\u00E7\u00F5es de Saque Nacional dentro de cada ciclo de faturamento")
  public BigDecimal getSaldoDisponivelSaque() {
    return saldoDisponivelSaque;
  }
  public void setSaldoDisponivelSaque(BigDecimal saldoDisponivelSaque) {
    this.saldoDisponivelSaque = saldoDisponivelSaque;
  }

  
  /**
   * Flag para s\u00F3cios do banco que s\u00E3o portadores do cart\u00E3o, mas n\u00E3o podem operar transa\u00E7\u00F5es de cr\u00E9dito(Lei n. 4.595/64)
   **/
  @ApiModelProperty(value = "Flag para s\u00F3cios do banco que s\u00E3o portadores do cart\u00E3o, mas n\u00E3o podem operar transa\u00E7\u00F5es de cr\u00E9dito(Lei n. 4.595/64)")
  public Boolean getImpedidoFinanciamento() {
    return impedidoFinanciamento;
  }
  public void setImpedidoFinanciamento(Boolean impedidoFinanciamento) {
    this.impedidoFinanciamento = impedidoFinanciamento;
  }

  
  /**
   * Apresenta a quantidade de dias que a conta esta em atraso
   **/
  @ApiModelProperty(value = "Apresenta a quantidade de dias que a conta esta em atraso")
  public Long getDiasAtraso() {
    return diasAtraso;
  }
  public void setDiasAtraso(Long diasAtraso) {
    this.diasAtraso = diasAtraso;
  }

  
  /**
   * Pr\u00F3ximo Vencimento Padr\u00E3o
   **/
  @ApiModelProperty(value = "Pr\u00F3ximo Vencimento Padr\u00E3o")
  public String getProximoVencimentoPadrao() {
    return proximoVencimentoPadrao;
  }
  public void setProximoVencimentoPadrao(String proximoVencimentoPadrao) {
    this.proximoVencimentoPadrao = proximoVencimentoPadrao;
  }

  
  /**
   * Identificador da proposta
   **/
  @ApiModelProperty(value = "Identificador da proposta")
  public Long getIdProposta() {
    return idProposta;
  }
  public void setIdProposta(Long idProposta) {
    this.idProposta = idProposta;
  }

  
  /**
   * Quantidade de pagamentos
   **/
  @ApiModelProperty(value = "Quantidade de pagamentos")
  public Integer getQuantidadePagamentos() {
    return quantidadePagamentos;
  }
  public void setQuantidadePagamentos(Integer quantidadePagamentos) {
    this.quantidadePagamentos = quantidadePagamentos;
  }

  
  /**
   * correspond\u00EAncia
   **/
  @ApiModelProperty(value = "correspond\u00EAncia")
  public Long getCorrespondencia() {
    return correspondencia;
  }
  public void setCorrespondencia(Long correspondencia) {
    this.correspondencia = correspondencia;
  }

  
  /**
   * Data de vencimento da cobran\u00E7a
   **/
  @ApiModelProperty(value = "Data de vencimento da cobran\u00E7a")
  public String getDataInicioAtraso() {
    return dataInicioAtraso;
  }
  public void setDataInicioAtraso(String dataInicioAtraso) {
    this.dataInicioAtraso = dataInicioAtraso;
  }

  
  /**
   * Apresenta valor rotativo de juros da conta
   **/
  @ApiModelProperty(value = "Apresenta valor rotativo de juros da conta")
  public BigDecimal getRotativoPagaJuros() {
    return rotativoPagaJuros;
  }
  public void setRotativoPagaJuros(BigDecimal rotativoPagaJuros) {
    this.rotativoPagaJuros = rotativoPagaJuros;
  }

  
  /**
   * Apresenta valor da fatura ap\u00F3s a pr\u00F3xima
   **/
  @ApiModelProperty(value = "Apresenta valor da fatura ap\u00F3s a pr\u00F3xima")
  public BigDecimal getTotalPosProx() {
    return totalPosProx;
  }
  public void setTotalPosProx(BigDecimal totalPosProx) {
    this.totalPosProx = totalPosProx;
  }

  
  /**
   * Apresenta valor do saldo atual final
   **/
  @ApiModelProperty(value = "Apresenta valor do saldo atual final")
  public BigDecimal getSaldoAtualFinal() {
    return saldoAtualFinal;
  }
  public void setSaldoAtualFinal(BigDecimal saldoAtualFinal) {
    this.saldoAtualFinal = saldoAtualFinal;
  }

  
  /**
   * Apresenta o saldo do extrato anterior da conta
   **/
  @ApiModelProperty(value = "Apresenta o saldo do extrato anterior da conta")
  public BigDecimal getSaldoExtratoAnterior() {
    return saldoExtratoAnterior;
  }
  public void setSaldoExtratoAnterior(BigDecimal saldoExtratoAnterior) {
    this.saldoExtratoAnterior = saldoExtratoAnterior;
  }

  
  /**
   * Flag que indica a aceita\u00E7\u00E3o de abertura de nova conta por grupo de produtos
   **/
  @ApiModelProperty(value = "Flag que indica a aceita\u00E7\u00E3o de abertura de nova conta por grupo de produtos")
  public Boolean getAceitaNovaContaPorGrupoProduto() {
    return aceitaNovaContaPorGrupoProduto;
  }
  public void setAceitaNovaContaPorGrupoProduto(Boolean aceitaNovaContaPorGrupoProduto) {
    this.aceitaNovaContaPorGrupoProduto = aceitaNovaContaPorGrupoProduto;
  }

  
  /**
   * Fun\u00E7\u00E3o ativa da conta
   **/
  @ApiModelProperty(value = "Fun\u00E7\u00E3o ativa da conta")
  public FuncaoAtivaEnum getFuncaoAtiva() {
    return funcaoAtiva;
  }
  public void setFuncaoAtiva(FuncaoAtivaEnum funcaoAtiva) {
    this.funcaoAtiva = funcaoAtiva;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContaDetalheResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idPessoa: ").append(idPessoa).append("\n");
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("  idProduto: ").append(idProduto).append("\n");
    sb.append("  idOrigemComercial: ").append(idOrigemComercial).append("\n");
    sb.append("  nomeOrigemComercial: ").append(nomeOrigemComercial).append("\n");
    sb.append("  idFantasiaBasica: ").append(idFantasiaBasica).append("\n");
    sb.append("  nomeFantasiaBasica: ").append(nomeFantasiaBasica).append("\n");
    sb.append("  idStatusConta: ").append(idStatusConta).append("\n");
    sb.append("  statusConta: ").append(statusConta).append("\n");
    sb.append("  diaVencimento: ").append(diaVencimento).append("\n");
    sb.append("  melhorDiaCompra: ").append(melhorDiaCompra).append("\n");
    sb.append("  dataStatusConta: ").append(dataStatusConta).append("\n");
    sb.append("  dataCadastro: ").append(dataCadastro).append("\n");
    sb.append("  dataUltimaAlteracaoVencimento: ").append(dataUltimaAlteracaoVencimento).append("\n");
    sb.append("  dataHoraUltimaCompra: ").append(dataHoraUltimaCompra).append("\n");
    sb.append("  numeroAgencia: ").append(numeroAgencia).append("\n");
    sb.append("  numeroContaCorrente: ").append(numeroContaCorrente).append("\n");
    sb.append("  valorRenda: ").append(valorRenda).append("\n");
    sb.append("  formaEnvioFatura: ").append(formaEnvioFatura).append("\n");
    sb.append("  titular: ").append(titular).append("\n");
    sb.append("  limiteGlobal: ").append(limiteGlobal).append("\n");
    sb.append("  limiteSaqueGlobal: ").append(limiteSaqueGlobal).append("\n");
    sb.append("  saldoDisponivelGlobal: ").append(saldoDisponivelGlobal).append("\n");
    sb.append("  saldoDisponivelSaque: ").append(saldoDisponivelSaque).append("\n");
    sb.append("  impedidoFinanciamento: ").append(impedidoFinanciamento).append("\n");
    sb.append("  diasAtraso: ").append(diasAtraso).append("\n");
    sb.append("  proximoVencimentoPadrao: ").append(proximoVencimentoPadrao).append("\n");
    sb.append("  idProposta: ").append(idProposta).append("\n");
    sb.append("  quantidadePagamentos: ").append(quantidadePagamentos).append("\n");
    sb.append("  correspondencia: ").append(correspondencia).append("\n");
    sb.append("  dataInicioAtraso: ").append(dataInicioAtraso).append("\n");
    sb.append("  rotativoPagaJuros: ").append(rotativoPagaJuros).append("\n");
    sb.append("  totalPosProx: ").append(totalPosProx).append("\n");
    sb.append("  saldoAtualFinal: ").append(saldoAtualFinal).append("\n");
    sb.append("  saldoExtratoAnterior: ").append(saldoExtratoAnterior).append("\n");
    sb.append("  aceitaNovaContaPorGrupoProduto: ").append(aceitaNovaContaPorGrupoProduto).append("\n");
    sb.append("  funcaoAtiva: ").append(funcaoAtiva).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
