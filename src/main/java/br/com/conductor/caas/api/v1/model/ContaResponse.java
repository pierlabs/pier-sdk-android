package br.com.conductor.caas.api.v1.model;

import br.com.conductor.caas.api.v1.model.CartaoResponse;
import br.com.conductor.caas.api.v1.model.PessoaFisicaResponse;
import br.com.conductor.caas.api.v1.model.SaldoLimiteResponse;
import java.util.Date;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



@ApiModel(description = "")
public class ContaResponse  {
  
  @SerializedName("bin")
  private Integer bin = null;
  @SerializedName("cartao")
  private CartaoResponse cartao = null;
  @SerializedName("dataCadastramento")
  private String dataCadastramento = null;
  @SerializedName("dataUltimoPagamento")
  private String dataUltimoPagamento = null;
  @SerializedName("dataVencCobranca")
  private String dataVencCobranca = null;
  @SerializedName("dddcelularSMS")
  private String dddcelularSMS = null;
  @SerializedName("descricaoStatus")
  private String descricaoStatus = null;
  @SerializedName("diasEmAtraso")
  private Integer diasEmAtraso = null;
  @SerializedName("emissor")
  private String emissor = null;
  @SerializedName("flagCancelamento")
  private Boolean flagCancelamento = null;
  @SerializedName("formaEnvioFatura")
  private String formaEnvioFatura = null;
  @SerializedName("idBandeira")
  private Integer idBandeira = null;
  @SerializedName("idConta")
  private Integer idConta = null;
  @SerializedName("idEmissor")
  private Integer idEmissor = null;
  @SerializedName("idEndereco")
  private Integer idEndereco = null;
  @SerializedName("idFantasiaBasica")
  private Integer idFantasiaBasica = null;
  @SerializedName("idOrigemComercial")
  private Integer idOrigemComercial = null;
  @SerializedName("idProduto")
  private Integer idProduto = null;
  @SerializedName("idProposta")
  private Integer idProposta = null;
  @SerializedName("melhorDia")
  private Integer melhorDia = null;
  @SerializedName("nomeCredor")
  private String nomeCredor = null;
  @SerializedName("nomeProduto")
  private String nomeProduto = null;
  @SerializedName("numCelularSMS")
  private String numCelularSMS = null;
  @SerializedName("pagamentos")
  private Double pagamentos = null;
  @SerializedName("permiteRefinanciamento")
  private Boolean permiteRefinanciamento = null;
  @SerializedName("pessoaFisica")
  private PessoaFisicaResponse pessoaFisica = null;
  @SerializedName("quantidadePagamentos")
  private Integer quantidadePagamentos = null;
  @SerializedName("saldoLimite")
  private SaldoLimiteResponse saldoLimite = null;
  @SerializedName("status")
  private Integer status = null;
  @SerializedName("statusData")
  private Date statusData = null;
  @SerializedName("taxaRefinanciamento")
  private String taxaRefinanciamento = null;
  @SerializedName("vcto")
  private String vcto = null;
  @SerializedName("vencimento1")
  private Integer vencimento1 = null;
  @SerializedName("vinculoOrigemUsuario")
  private Boolean vinculoOrigemUsuario = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getBin() {
    return bin;
  }
  public void setBin(Integer bin) {
    this.bin = bin;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public CartaoResponse getCartao() {
    return cartao;
  }
  public void setCartao(CartaoResponse cartao) {
    this.cartao = cartao;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getDataCadastramento() {
    return dataCadastramento;
  }
  public void setDataCadastramento(String dataCadastramento) {
    this.dataCadastramento = dataCadastramento;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getDataUltimoPagamento() {
    return dataUltimoPagamento;
  }
  public void setDataUltimoPagamento(String dataUltimoPagamento) {
    this.dataUltimoPagamento = dataUltimoPagamento;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getDataVencCobranca() {
    return dataVencCobranca;
  }
  public void setDataVencCobranca(String dataVencCobranca) {
    this.dataVencCobranca = dataVencCobranca;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getDddcelularSMS() {
    return dddcelularSMS;
  }
  public void setDddcelularSMS(String dddcelularSMS) {
    this.dddcelularSMS = dddcelularSMS;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getDescricaoStatus() {
    return descricaoStatus;
  }
  public void setDescricaoStatus(String descricaoStatus) {
    this.descricaoStatus = descricaoStatus;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getDiasEmAtraso() {
    return diasEmAtraso;
  }
  public void setDiasEmAtraso(Integer diasEmAtraso) {
    this.diasEmAtraso = diasEmAtraso;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getEmissor() {
    return emissor;
  }
  public void setEmissor(String emissor) {
    this.emissor = emissor;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getFlagCancelamento() {
    return flagCancelamento;
  }
  public void setFlagCancelamento(Boolean flagCancelamento) {
    this.flagCancelamento = flagCancelamento;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getFormaEnvioFatura() {
    return formaEnvioFatura;
  }
  public void setFormaEnvioFatura(String formaEnvioFatura) {
    this.formaEnvioFatura = formaEnvioFatura;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getIdBandeira() {
    return idBandeira;
  }
  public void setIdBandeira(Integer idBandeira) {
    this.idBandeira = idBandeira;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getIdConta() {
    return idConta;
  }
  public void setIdConta(Integer idConta) {
    this.idConta = idConta;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getIdEmissor() {
    return idEmissor;
  }
  public void setIdEmissor(Integer idEmissor) {
    this.idEmissor = idEmissor;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getIdEndereco() {
    return idEndereco;
  }
  public void setIdEndereco(Integer idEndereco) {
    this.idEndereco = idEndereco;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getIdFantasiaBasica() {
    return idFantasiaBasica;
  }
  public void setIdFantasiaBasica(Integer idFantasiaBasica) {
    this.idFantasiaBasica = idFantasiaBasica;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getIdOrigemComercial() {
    return idOrigemComercial;
  }
  public void setIdOrigemComercial(Integer idOrigemComercial) {
    this.idOrigemComercial = idOrigemComercial;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Integer idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getIdProposta() {
    return idProposta;
  }
  public void setIdProposta(Integer idProposta) {
    this.idProposta = idProposta;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getMelhorDia() {
    return melhorDia;
  }
  public void setMelhorDia(Integer melhorDia) {
    this.melhorDia = melhorDia;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getNomeCredor() {
    return nomeCredor;
  }
  public void setNomeCredor(String nomeCredor) {
    this.nomeCredor = nomeCredor;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getNomeProduto() {
    return nomeProduto;
  }
  public void setNomeProduto(String nomeProduto) {
    this.nomeProduto = nomeProduto;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getNumCelularSMS() {
    return numCelularSMS;
  }
  public void setNumCelularSMS(String numCelularSMS) {
    this.numCelularSMS = numCelularSMS;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getPagamentos() {
    return pagamentos;
  }
  public void setPagamentos(Double pagamentos) {
    this.pagamentos = pagamentos;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getPermiteRefinanciamento() {
    return permiteRefinanciamento;
  }
  public void setPermiteRefinanciamento(Boolean permiteRefinanciamento) {
    this.permiteRefinanciamento = permiteRefinanciamento;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public PessoaFisicaResponse getPessoaFisica() {
    return pessoaFisica;
  }
  public void setPessoaFisica(PessoaFisicaResponse pessoaFisica) {
    this.pessoaFisica = pessoaFisica;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getQuantidadePagamentos() {
    return quantidadePagamentos;
  }
  public void setQuantidadePagamentos(Integer quantidadePagamentos) {
    this.quantidadePagamentos = quantidadePagamentos;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public SaldoLimiteResponse getSaldoLimite() {
    return saldoLimite;
  }
  public void setSaldoLimite(SaldoLimiteResponse saldoLimite) {
    this.saldoLimite = saldoLimite;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
    this.status = status;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Date getStatusData() {
    return statusData;
  }
  public void setStatusData(Date statusData) {
    this.statusData = statusData;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getTaxaRefinanciamento() {
    return taxaRefinanciamento;
  }
  public void setTaxaRefinanciamento(String taxaRefinanciamento) {
    this.taxaRefinanciamento = taxaRefinanciamento;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getVcto() {
    return vcto;
  }
  public void setVcto(String vcto) {
    this.vcto = vcto;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getVencimento1() {
    return vencimento1;
  }
  public void setVencimento1(Integer vencimento1) {
    this.vencimento1 = vencimento1;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getVinculoOrigemUsuario() {
    return vinculoOrigemUsuario;
  }
  public void setVinculoOrigemUsuario(Boolean vinculoOrigemUsuario) {
    this.vinculoOrigemUsuario = vinculoOrigemUsuario;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContaResponse {\n");
    
    sb.append("  bin: ").append(bin).append("\n");
    sb.append("  cartao: ").append(cartao).append("\n");
    sb.append("  dataCadastramento: ").append(dataCadastramento).append("\n");
    sb.append("  dataUltimoPagamento: ").append(dataUltimoPagamento).append("\n");
    sb.append("  dataVencCobranca: ").append(dataVencCobranca).append("\n");
    sb.append("  dddcelularSMS: ").append(dddcelularSMS).append("\n");
    sb.append("  descricaoStatus: ").append(descricaoStatus).append("\n");
    sb.append("  diasEmAtraso: ").append(diasEmAtraso).append("\n");
    sb.append("  emissor: ").append(emissor).append("\n");
    sb.append("  flagCancelamento: ").append(flagCancelamento).append("\n");
    sb.append("  formaEnvioFatura: ").append(formaEnvioFatura).append("\n");
    sb.append("  idBandeira: ").append(idBandeira).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  idEmissor: ").append(idEmissor).append("\n");
    sb.append("  idEndereco: ").append(idEndereco).append("\n");
    sb.append("  idFantasiaBasica: ").append(idFantasiaBasica).append("\n");
    sb.append("  idOrigemComercial: ").append(idOrigemComercial).append("\n");
    sb.append("  idProduto: ").append(idProduto).append("\n");
    sb.append("  idProposta: ").append(idProposta).append("\n");
    sb.append("  melhorDia: ").append(melhorDia).append("\n");
    sb.append("  nomeCredor: ").append(nomeCredor).append("\n");
    sb.append("  nomeProduto: ").append(nomeProduto).append("\n");
    sb.append("  numCelularSMS: ").append(numCelularSMS).append("\n");
    sb.append("  pagamentos: ").append(pagamentos).append("\n");
    sb.append("  permiteRefinanciamento: ").append(permiteRefinanciamento).append("\n");
    sb.append("  pessoaFisica: ").append(pessoaFisica).append("\n");
    sb.append("  quantidadePagamentos: ").append(quantidadePagamentos).append("\n");
    sb.append("  saldoLimite: ").append(saldoLimite).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  statusData: ").append(statusData).append("\n");
    sb.append("  taxaRefinanciamento: ").append(taxaRefinanciamento).append("\n");
    sb.append("  vcto: ").append(vcto).append("\n");
    sb.append("  vencimento1: ").append(vencimento1).append("\n");
    sb.append("  vinculoOrigemUsuario: ").append(vinculoOrigemUsuario).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


