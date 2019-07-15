package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto para atualiza\u00E7\u00E3o parcial
 **/
@ApiModel(description = "Objeto para atualiza\u00E7\u00E3o parcial")
public class OperacaoBancariaParcialUpdate  {
  
  @SerializedName("idContaDestino")
  private Long idContaDestino = null;
  @SerializedName("idCartaoOrigem")
  private Long idCartaoOrigem = null;
  @SerializedName("idCartaoDestino")
  private Long idCartaoDestino = null;
  @SerializedName("bancoPagador")
  private String bancoPagador = null;
  @SerializedName("agenciaPagadora")
  private String agenciaPagadora = null;
  @SerializedName("contaPagadora")
  private String contaPagadora = null;
  @SerializedName("dvContaPagadora")
  private String dvContaPagadora = null;
  @SerializedName("nomePagador")
  private String nomePagador = null;
  @SerializedName("cpfCnpjBeneficiario")
  private String cpfCnpjBeneficiario = null;
  @SerializedName("idEventoAjusteOrigem")
  private Long idEventoAjusteOrigem = null;
  @SerializedName("idEventoAjusteDestino")
  private Long idEventoAjusteDestino = null;
  @SerializedName("idExterno")
  private String idExterno = null;
  @SerializedName("codigoIspb")
  private String codigoIspb = null;
  public enum StatusEnum {
     NORMAL,  CANCELADA,  PROCESSADA,  PENDENTE,  DESFEITA,  ESTORNADA,  AGENDADA,  CANCELADA_SEM_SALDO,  ESTORNO_INFOS_INCORRETAS,  ESTORNO_TED, 
  };
  @SerializedName("status")
  private StatusEnum status = null;
  @SerializedName("idOperacaoBancariaOriginal")
  private Long idOperacaoBancariaOriginal = null;
  @SerializedName("observacao")
  private String observacao = null;
  @SerializedName("numeroBilheteUnico")
  private Long numeroBilheteUnico = null;
  @SerializedName("idDocumento")
  private Long idDocumento = null;
  @SerializedName("idCelularRecarga")
  private Long idCelularRecarga = null;
  @SerializedName("nomeBeneficiario")
  private String nomeBeneficiario = null;
  @SerializedName("bancoBeneficiario")
  private String bancoBeneficiario = null;
  @SerializedName("agenciaBeneficiario")
  private String agenciaBeneficiario = null;
  @SerializedName("contaBeneficiario")
  private String contaBeneficiario = null;
  @SerializedName("dvContaBeneficiario")
  private String dvContaBeneficiario = null;
  @SerializedName("operadora")
  private String operadora = null;
  @SerializedName("celular")
  private String celular = null;
  @SerializedName("ddd")
  private String ddd = null;
  @SerializedName("dataRealizacao")
  private String dataRealizacao = null;
  @SerializedName("dataAgendamento")
  private String dataAgendamento = null;
  @SerializedName("valorOperacao")
  private BigDecimal valorOperacao = null;

  
  /**
   * C\u00F3digo identificador da conta de destino
   **/
  @ApiModelProperty(value = "C\u00F3digo identificador da conta de destino")
  public Long getIdContaDestino() {
    return idContaDestino;
  }
  public void setIdContaDestino(Long idContaDestino) {
    this.idContaDestino = idContaDestino;
  }

  
  /**
   * C\u00F3digo identificador do cart\u00E3o de origem
   **/
  @ApiModelProperty(value = "C\u00F3digo identificador do cart\u00E3o de origem")
  public Long getIdCartaoOrigem() {
    return idCartaoOrigem;
  }
  public void setIdCartaoOrigem(Long idCartaoOrigem) {
    this.idCartaoOrigem = idCartaoOrigem;
  }

  
  /**
   * C\u00F3digo identificador do cart\u00E3o de destino
   **/
  @ApiModelProperty(value = "C\u00F3digo identificador do cart\u00E3o de destino")
  public Long getIdCartaoDestino() {
    return idCartaoDestino;
  }
  public void setIdCartaoDestino(Long idCartaoDestino) {
    this.idCartaoDestino = idCartaoDestino;
  }

  
  /**
   * N\u00FAmero do banco pagador
   **/
  @ApiModelProperty(value = "N\u00FAmero do banco pagador")
  public String getBancoPagador() {
    return bancoPagador;
  }
  public void setBancoPagador(String bancoPagador) {
    this.bancoPagador = bancoPagador;
  }

  
  /**
   * N\u00FAmero da ag\u00EAncia pagadora
   **/
  @ApiModelProperty(value = "N\u00FAmero da ag\u00EAncia pagadora")
  public String getAgenciaPagadora() {
    return agenciaPagadora;
  }
  public void setAgenciaPagadora(String agenciaPagadora) {
    this.agenciaPagadora = agenciaPagadora;
  }

  
  /**
   * N\u00FAmero da conta pagadora
   **/
  @ApiModelProperty(value = "N\u00FAmero da conta pagadora")
  public String getContaPagadora() {
    return contaPagadora;
  }
  public void setContaPagadora(String contaPagadora) {
    this.contaPagadora = contaPagadora;
  }

  
  /**
   * D\u00EDgito verificador da conta do favorecido
   **/
  @ApiModelProperty(value = "D\u00EDgito verificador da conta do favorecido")
  public String getDvContaPagadora() {
    return dvContaPagadora;
  }
  public void setDvContaPagadora(String dvContaPagadora) {
    this.dvContaPagadora = dvContaPagadora;
  }

  
  /**
   * Nome do pagador envolvendo transfer\u00EAncias
   **/
  @ApiModelProperty(value = "Nome do pagador envolvendo transfer\u00EAncias")
  public String getNomePagador() {
    return nomePagador;
  }
  public void setNomePagador(String nomePagador) {
    this.nomePagador = nomePagador;
  }

  
  /**
   * CPF/CNPJ do benefici\u00E1rio
   **/
  @ApiModelProperty(value = "CPF/CNPJ do benefici\u00E1rio")
  public String getCpfCnpjBeneficiario() {
    return cpfCnpjBeneficiario;
  }
  public void setCpfCnpjBeneficiario(String cpfCnpjBeneficiario) {
    this.cpfCnpjBeneficiario = cpfCnpjBeneficiario;
  }

  
  /**
   * Identificador evento origem
   **/
  @ApiModelProperty(value = "Identificador evento origem")
  public Long getIdEventoAjusteOrigem() {
    return idEventoAjusteOrigem;
  }
  public void setIdEventoAjusteOrigem(Long idEventoAjusteOrigem) {
    this.idEventoAjusteOrigem = idEventoAjusteOrigem;
  }

  
  /**
   * Identificador evento destino
   **/
  @ApiModelProperty(value = "Identificador evento destino")
  public Long getIdEventoAjusteDestino() {
    return idEventoAjusteDestino;
  }
  public void setIdEventoAjusteDestino(Long idEventoAjusteDestino) {
    this.idEventoAjusteDestino = idEventoAjusteDestino;
  }

  
  /**
   * C\u00F3digo identificador de opera\u00E7\u00F5es externas
   **/
  @ApiModelProperty(value = "C\u00F3digo identificador de opera\u00E7\u00F5es externas")
  public String getIdExterno() {
    return idExterno;
  }
  public void setIdExterno(String idExterno) {
    this.idExterno = idExterno;
  }

  
  /**
   * C\u00F3digo ISPB do banco de destino
   **/
  @ApiModelProperty(value = "C\u00F3digo ISPB do banco de destino")
  public String getCodigoIspb() {
    return codigoIspb;
  }
  public void setCodigoIspb(String codigoIspb) {
    this.codigoIspb = codigoIspb;
  }

  
  /**
   * Status da opera\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Status da opera\u00E7\u00E3o")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   * Identificador da opera\u00E7\u00E3o banc\u00E1ria original
   **/
  @ApiModelProperty(value = "Identificador da opera\u00E7\u00E3o banc\u00E1ria original")
  public Long getIdOperacaoBancariaOriginal() {
    return idOperacaoBancariaOriginal;
  }
  public void setIdOperacaoBancariaOriginal(Long idOperacaoBancariaOriginal) {
    this.idOperacaoBancariaOriginal = idOperacaoBancariaOriginal;
  }

  
  /**
   * Observa\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Observa\u00E7\u00E3o")
  public String getObservacao() {
    return observacao;
  }
  public void setObservacao(String observacao) {
    this.observacao = observacao;
  }

  
  /**
   * N\u00FAmero do bilhete \u00FAnico
   **/
  @ApiModelProperty(value = "N\u00FAmero do bilhete \u00FAnico")
  public Long getNumeroBilheteUnico() {
    return numeroBilheteUnico;
  }
  public void setNumeroBilheteUnico(Long numeroBilheteUnico) {
    this.numeroBilheteUnico = numeroBilheteUnico;
  }

  
  /**
   * Identificador do comprovante
   **/
  @ApiModelProperty(value = "Identificador do comprovante")
  public Long getIdDocumento() {
    return idDocumento;
  }
  public void setIdDocumento(Long idDocumento) {
    this.idDocumento = idDocumento;
  }

  
  /**
   * Identificador do celular
   **/
  @ApiModelProperty(value = "Identificador do celular")
  public Long getIdCelularRecarga() {
    return idCelularRecarga;
  }
  public void setIdCelularRecarga(Long idCelularRecarga) {
    this.idCelularRecarga = idCelularRecarga;
  }

  
  /**
   * Nome do benefici\u00E1rio envolvendo transfer\u00EAncias
   **/
  @ApiModelProperty(value = "Nome do benefici\u00E1rio envolvendo transfer\u00EAncias")
  public String getNomeBeneficiario() {
    return nomeBeneficiario;
  }
  public void setNomeBeneficiario(String nomeBeneficiario) {
    this.nomeBeneficiario = nomeBeneficiario;
  }

  
  /**
   * Origem do banco do benefici\u00E1rio envolvendo transfer\u00EAncias
   **/
  @ApiModelProperty(value = "Origem do banco do benefici\u00E1rio envolvendo transfer\u00EAncias")
  public String getBancoBeneficiario() {
    return bancoBeneficiario;
  }
  public void setBancoBeneficiario(String bancoBeneficiario) {
    this.bancoBeneficiario = bancoBeneficiario;
  }

  
  /**
   * Origem da ag\u00EAncia do benefici\u00E1rio envolvendo transfer\u00EAncias
   **/
  @ApiModelProperty(value = "Origem da ag\u00EAncia do benefici\u00E1rio envolvendo transfer\u00EAncias")
  public String getAgenciaBeneficiario() {
    return agenciaBeneficiario;
  }
  public void setAgenciaBeneficiario(String agenciaBeneficiario) {
    this.agenciaBeneficiario = agenciaBeneficiario;
  }

  
  /**
   * Conta origem do benefici\u00E1rio envolvendo transfer\u00EAncias
   **/
  @ApiModelProperty(value = "Conta origem do benefici\u00E1rio envolvendo transfer\u00EAncias")
  public String getContaBeneficiario() {
    return contaBeneficiario;
  }
  public void setContaBeneficiario(String contaBeneficiario) {
    this.contaBeneficiario = contaBeneficiario;
  }

  
  /**
   * D\u00EDgito da conta do benefici\u00E1rio origem envolvendo transfer\u00EAncias
   **/
  @ApiModelProperty(value = "D\u00EDgito da conta do benefici\u00E1rio origem envolvendo transfer\u00EAncias")
  public String getDvContaBeneficiario() {
    return dvContaBeneficiario;
  }
  public void setDvContaBeneficiario(String dvContaBeneficiario) {
    this.dvContaBeneficiario = dvContaBeneficiario;
  }

  
  /**
   * Descri\u00E7\u00E3o da operadora do celular
   **/
  @ApiModelProperty(value = "Descri\u00E7\u00E3o da operadora do celular")
  public String getOperadora() {
    return operadora;
  }
  public void setOperadora(String operadora) {
    this.operadora = operadora;
  }

  
  /**
   * N\u00FAmero da operadora
   **/
  @ApiModelProperty(value = "N\u00FAmero da operadora")
  public String getCelular() {
    return celular;
  }
  public void setCelular(String celular) {
    this.celular = celular;
  }

  
  /**
   * DDD do celular
   **/
  @ApiModelProperty(value = "DDD do celular")
  public String getDdd() {
    return ddd;
  }
  public void setDdd(String ddd) {
    this.ddd = ddd;
  }

  
  /**
   * Data e hora referente a realiza\u00E7\u00E3o da opera\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Data e hora referente a realiza\u00E7\u00E3o da opera\u00E7\u00E3o")
  public String getDataRealizacao() {
    return dataRealizacao;
  }
  public void setDataRealizacao(String dataRealizacao) {
    this.dataRealizacao = dataRealizacao;
  }

  
  /**
   * Data e hora referente ao agendamento da opera\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Data e hora referente ao agendamento da opera\u00E7\u00E3o")
  public String getDataAgendamento() {
    return dataAgendamento;
  }
  public void setDataAgendamento(String dataAgendamento) {
    this.dataAgendamento = dataAgendamento;
  }

  
  /**
   * Valor movimentado na opera\u00E7\u00E3o banc\u00E1ria
   **/
  @ApiModelProperty(value = "Valor movimentado na opera\u00E7\u00E3o banc\u00E1ria")
  public BigDecimal getValorOperacao() {
    return valorOperacao;
  }
  public void setValorOperacao(BigDecimal valorOperacao) {
    this.valorOperacao = valorOperacao;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperacaoBancariaParcialUpdate {\n");
    
    sb.append("  idContaDestino: ").append(idContaDestino).append("\n");
    sb.append("  idCartaoOrigem: ").append(idCartaoOrigem).append("\n");
    sb.append("  idCartaoDestino: ").append(idCartaoDestino).append("\n");
    sb.append("  bancoPagador: ").append(bancoPagador).append("\n");
    sb.append("  agenciaPagadora: ").append(agenciaPagadora).append("\n");
    sb.append("  contaPagadora: ").append(contaPagadora).append("\n");
    sb.append("  dvContaPagadora: ").append(dvContaPagadora).append("\n");
    sb.append("  nomePagador: ").append(nomePagador).append("\n");
    sb.append("  cpfCnpjBeneficiario: ").append(cpfCnpjBeneficiario).append("\n");
    sb.append("  idEventoAjusteOrigem: ").append(idEventoAjusteOrigem).append("\n");
    sb.append("  idEventoAjusteDestino: ").append(idEventoAjusteDestino).append("\n");
    sb.append("  idExterno: ").append(idExterno).append("\n");
    sb.append("  codigoIspb: ").append(codigoIspb).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  idOperacaoBancariaOriginal: ").append(idOperacaoBancariaOriginal).append("\n");
    sb.append("  observacao: ").append(observacao).append("\n");
    sb.append("  numeroBilheteUnico: ").append(numeroBilheteUnico).append("\n");
    sb.append("  idDocumento: ").append(idDocumento).append("\n");
    sb.append("  idCelularRecarga: ").append(idCelularRecarga).append("\n");
    sb.append("  nomeBeneficiario: ").append(nomeBeneficiario).append("\n");
    sb.append("  bancoBeneficiario: ").append(bancoBeneficiario).append("\n");
    sb.append("  agenciaBeneficiario: ").append(agenciaBeneficiario).append("\n");
    sb.append("  contaBeneficiario: ").append(contaBeneficiario).append("\n");
    sb.append("  dvContaBeneficiario: ").append(dvContaBeneficiario).append("\n");
    sb.append("  operadora: ").append(operadora).append("\n");
    sb.append("  celular: ").append(celular).append("\n");
    sb.append("  ddd: ").append(ddd).append("\n");
    sb.append("  dataRealizacao: ").append(dataRealizacao).append("\n");
    sb.append("  dataAgendamento: ").append(dataAgendamento).append("\n");
    sb.append("  valorOperacao: ").append(valorOperacao).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
