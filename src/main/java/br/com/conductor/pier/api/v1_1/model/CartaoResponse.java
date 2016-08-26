package br.com.conductor.pier.api.v1_1.model;

import org.joda.time.*;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



@ApiModel(description = "")
public class CartaoResponse  {
  
  @SerializedName("arquivoImpressao")
  private String arquivoImpressao = null;
  @SerializedName("codigoDesbloqueio")
  private String codigoDesbloqueio = null;
  @SerializedName("dataEstagioCartao")
  private LocalDateTime dataEstagioCartao = null;
  @SerializedName("dataGeracao")
  private LocalDateTime dataGeracao = null;
  @SerializedName("dataImpressao")
  private LocalDateTime dataImpressao = null;
  @SerializedName("dataStatusCartao")
  private LocalDateTime dataStatusCartao = null;
  @SerializedName("dataValidade")
  private LocalDateTime dataValidade = null;
  @SerializedName("flagImpressaoOrigemComercial")
  private Integer flagImpressaoOrigemComercial = null;
  @SerializedName("flagProvisorio")
  private Integer flagProvisorio = null;
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("idEstagioCartao")
  private Long idEstagioCartao = null;
  @SerializedName("idPessoa")
  private Long idPessoa = null;
  @SerializedName("idStatusCartao")
  private Long idStatusCartao = null;
  @SerializedName("numeroCartao")
  private String numeroCartao = null;
  @SerializedName("portador")
  private Integer portador = null;

  
  /**
   * Apresenta o nome do arquivo onde o cart\u00C3\u00A3o fora inclu\u00C3\u00ADdo para impress\u00C3\u00A3o por uma gr\u00C3\u00A1fica, quando houver.
   **/
  @ApiModelProperty(required = true, value = "Apresenta o nome do arquivo onde o cart\u00C3\u00A3o fora inclu\u00C3\u00ADdo para impress\u00C3\u00A3o por uma gr\u00C3\u00A1fica, quando houver.")
  public String getArquivoImpressao() {
    return arquivoImpressao;
  }
  public void setArquivoImpressao(String arquivoImpressao) {
    this.arquivoImpressao = arquivoImpressao;
  }

  
  /**
   * Apresenta um c\u00C3\u00B3digo espec\u00C3\u00ADfico para ser utilizado como vari\u00C3\u00A1vel no processo de desbloqueio do cart\u00C3\u00A3o para emissores que querem usar esta funcionalidade.
   **/
  @ApiModelProperty(required = true, value = "Apresenta um c\u00C3\u00B3digo espec\u00C3\u00ADfico para ser utilizado como vari\u00C3\u00A1vel no processo de desbloqueio do cart\u00C3\u00A3o para emissores que querem usar esta funcionalidade.")
  public String getCodigoDesbloqueio() {
    return codigoDesbloqueio;
  }
  public void setCodigoDesbloqueio(String codigoDesbloqueio) {
    this.codigoDesbloqueio = codigoDesbloqueio;
  }

  
  /**
   * Apresenta a data em que o idEstagioCartao atual do cart\u00C3\u00A3o fora aplicado, quando houver.
   **/
  @ApiModelProperty(required = true, value = "Apresenta a data em que o idEstagioCartao atual do cart\u00C3\u00A3o fora aplicado, quando houver.")
  public LocalDateTime getDataEstagioCartao() {
    return dataEstagioCartao;
  }
  public void setDataEstagioCartao(LocalDateTime dataEstagioCartao) {
    this.dataEstagioCartao = dataEstagioCartao;
  }

  
  /**
   * Apresenta a data em que o cart\u00C3\u00A3o foi gerado.
   **/
  @ApiModelProperty(required = true, value = "Apresenta a data em que o cart\u00C3\u00A3o foi gerado.")
  public LocalDateTime getDataGeracao() {
    return dataGeracao;
  }
  public void setDataGeracao(LocalDateTime dataGeracao) {
    this.dataGeracao = dataGeracao;
  }

  
  /**
   * Apresenta a data em que o cart\u00C3\u00A3o fora impresso, caso impress\u00C3\u00A3o em loja, ou a data em que ele fora inclu\u00C3\u00ADdo no arquivo para impress\u00C3\u00A3o via gr\u00C3\u00A1fica.
   **/
  @ApiModelProperty(required = true, value = "Apresenta a data em que o cart\u00C3\u00A3o fora impresso, caso impress\u00C3\u00A3o em loja, ou a data em que ele fora inclu\u00C3\u00ADdo no arquivo para impress\u00C3\u00A3o via gr\u00C3\u00A1fica.")
  public LocalDateTime getDataImpressao() {
    return dataImpressao;
  }
  public void setDataImpressao(LocalDateTime dataImpressao) {
    this.dataImpressao = dataImpressao;
  }

  
  /**
   * Apresenta a data em que o idStatusCartao atual do cart\u00C3\u00A3o fora aplicado, quando houver.
   **/
  @ApiModelProperty(required = true, value = "Apresenta a data em que o idStatusCartao atual do cart\u00C3\u00A3o fora aplicado, quando houver.")
  public LocalDateTime getDataStatusCartao() {
    return dataStatusCartao;
  }
  public void setDataStatusCartao(LocalDateTime dataStatusCartao) {
    this.dataStatusCartao = dataStatusCartao;
  }

  
  /**
   * Apresenta a data de validade do cart\u00C3\u00A3o em formato MMAAAA, quando houver.
   **/
  @ApiModelProperty(required = true, value = "Apresenta a data de validade do cart\u00C3\u00A3o em formato MMAAAA, quando houver.")
  public LocalDateTime getDataValidade() {
    return dataValidade;
  }
  public void setDataValidade(LocalDateTime dataValidade) {
    this.dataValidade = dataValidade;
  }

  
  /**
   * Quando ativa, indica que o cart\u00C3\u00A3o fora impresso na Origem Comercial.
   **/
  @ApiModelProperty(required = true, value = "Quando ativa, indica que o cart\u00C3\u00A3o fora impresso na Origem Comercial.")
  public Integer getFlagImpressaoOrigemComercial() {
    return flagImpressaoOrigemComercial;
  }
  public void setFlagImpressaoOrigemComercial(Integer flagImpressaoOrigemComercial) {
    this.flagImpressaoOrigemComercial = flagImpressaoOrigemComercial;
  }

  
  /**
   * Quando ativa, indica que o cart\u00C3\u00A3o \u00C3\u00A9 provis\u00C3\u00B3rio. Ou seja, \u00C3\u00A9 um cart\u00C3\u00A3o para uso tempor\u00C3\u00A1rio quando se deseja permitir que o cliente transacione sem que ele tenha recebido um cart\u00C3\u00A3o definitivo.
   **/
  @ApiModelProperty(required = true, value = "Quando ativa, indica que o cart\u00C3\u00A3o \u00C3\u00A9 provis\u00C3\u00B3rio. Ou seja, \u00C3\u00A9 um cart\u00C3\u00A3o para uso tempor\u00C3\u00A1rio quando se deseja permitir que o cliente transacione sem que ele tenha recebido um cart\u00C3\u00A3o definitivo.")
  public Integer getFlagProvisorio() {
    return flagProvisorio;
  }
  public void setFlagProvisorio(Integer flagProvisorio) {
    this.flagProvisorio = flagProvisorio;
  }

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Cart\u00C3\u00A3o (id).
   **/
  @ApiModelProperty(required = true, value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Cart\u00C3\u00A3o (id).")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Conta a qual o cart\u00C3\u00A3o pertence (id).
   **/
  @ApiModelProperty(required = true, value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Conta a qual o cart\u00C3\u00A3o pertence (id).")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Est\u00C3\u00A1gio de Impress\u00C3\u00A3o do Cart\u00C3\u00A3o (id).
   **/
  @ApiModelProperty(required = true, value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Est\u00C3\u00A1gio de Impress\u00C3\u00A3o do Cart\u00C3\u00A3o (id).")
  public Long getIdEstagioCartao() {
    return idEstagioCartao;
  }
  public void setIdEstagioCartao(Long idEstagioCartao) {
    this.idEstagioCartao = idEstagioCartao;
  }

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Pessoa a qual o cart\u00C3\u00A3o pertence (id)
   **/
  @ApiModelProperty(required = true, value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Pessoa a qual o cart\u00C3\u00A3o pertence (id)")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Status do Cart\u00C3\u00A3o (id).
   **/
  @ApiModelProperty(required = true, value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Status do Cart\u00C3\u00A3o (id).")
  public Long getIdStatusCartao() {
    return idStatusCartao;
  }
  public void setIdStatusCartao(Long idStatusCartao) {
    this.idStatusCartao = idStatusCartao;
  }

  
  /**
   * Apresenta o n\u00C3\u00BAmero do cart\u00C3\u00A3o.
   **/
  @ApiModelProperty(required = true, value = "Apresenta o n\u00C3\u00BAmero do cart\u00C3\u00A3o.")
  public String getNumeroCartao() {
    return numeroCartao;
  }
  public void setNumeroCartao(String numeroCartao) {
    this.numeroCartao = numeroCartao;
  }

  
  /**
   * Indica qual \u00C3\u00A9 a rela\u00C3\u00A7\u00C3\u00A3o do portador do cart\u00C3\u00A3o com a conta. Quando \u00E2\u0080\u00981\u00E2\u0080\u0099, corresponde ao seu titular. Quando diferente disso, corresponde a um cart\u00C3\u00A3o adicional.
   **/
  @ApiModelProperty(required = true, value = "Indica qual \u00C3\u00A9 a rela\u00C3\u00A7\u00C3\u00A3o do portador do cart\u00C3\u00A3o com a conta. Quando \u00E2\u0080\u00981\u00E2\u0080\u0099, corresponde ao seu titular. Quando diferente disso, corresponde a um cart\u00C3\u00A3o adicional.")
  public Integer getPortador() {
    return portador;
  }
  public void setPortador(Integer portador) {
    this.portador = portador;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartaoResponse {\n");
    
    sb.append("  arquivoImpressao: ").append(arquivoImpressao).append("\n");
    sb.append("  codigoDesbloqueio: ").append(codigoDesbloqueio).append("\n");
    sb.append("  dataEstagioCartao: ").append(dataEstagioCartao).append("\n");
    sb.append("  dataGeracao: ").append(dataGeracao).append("\n");
    sb.append("  dataImpressao: ").append(dataImpressao).append("\n");
    sb.append("  dataStatusCartao: ").append(dataStatusCartao).append("\n");
    sb.append("  dataValidade: ").append(dataValidade).append("\n");
    sb.append("  flagImpressaoOrigemComercial: ").append(flagImpressaoOrigemComercial).append("\n");
    sb.append("  flagProvisorio: ").append(flagProvisorio).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  idEstagioCartao: ").append(idEstagioCartao).append("\n");
    sb.append("  idPessoa: ").append(idPessoa).append("\n");
    sb.append("  idStatusCartao: ").append(idStatusCartao).append("\n");
    sb.append("  numeroCartao: ").append(numeroCartao).append("\n");
    sb.append("  portador: ").append(portador).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


