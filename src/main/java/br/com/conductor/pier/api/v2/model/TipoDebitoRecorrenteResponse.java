package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Response Representation of the recurrent debit type resource
 **/
@ApiModel(description = "Response Representation of the recurrent debit type resource")
public class TipoDebitoRecorrenteResponse  {
  
  @SerializedName("flagAnuidadeBonificada")
  private Boolean flagAnuidadeBonificada = null;
  @SerializedName("id")
  private Long id = null;
  @SerializedName("nome")
  private String nome = null;
  @SerializedName("valor")
  private BigDecimal valor = null;
  @SerializedName("flagAtivo")
  private Boolean flagAtivo = null;
  @SerializedName("valorBonus")
  private BigDecimal valorBonus = null;
  @SerializedName("numeroParcelas")
  private Integer numeroParcelas = null;
  @SerializedName("flagAdereAutomatico")
  private Boolean flagAdereAutomatico = null;
  @SerializedName("flagGeraNumeroSorte")
  private Boolean flagGeraNumeroSorte = null;
  @SerializedName("faixaEtaria")
  private String faixaEtaria = null;
  @SerializedName("flagSeguro")
  private Boolean flagSeguro = null;
  @SerializedName("sorteiosMensais")
  private String sorteiosMensais = null;
  @SerializedName("flagAdesaoAutomatica")
  private Boolean flagAdesaoAutomatica = null;
  @SerializedName("flagDependente")
  private Boolean flagDependente = null;
  @SerializedName("quantidadeDependente")
  private Integer quantidadeDependente = null;
  @SerializedName("idTermoSeguroServico")
  private Long idTermoSeguroServico = null;
  @SerializedName("idadeMinima")
  private Integer idadeMinima = null;
  @SerializedName("idadeMaxima")
  private Integer idadeMaxima = null;
  @SerializedName("flagDebitoIncondicional")
  private Boolean flagDebitoIncondicional = null;
  @SerializedName("flagExtratoIncondicional")
  private Boolean flagExtratoIncondicional = null;
  @SerializedName("flagEstornoAutomatico")
  private Boolean flagEstornoAutomatico = null;
  @SerializedName("valorRepassadoSeguradora")
  private BigDecimal valorRepassadoSeguradora = null;
  @SerializedName("flagLancaTransacao")
  private Boolean flagLancaTransacao = null;
  @SerializedName("flagTransferenciaAutomatica")
  private Boolean flagTransferenciaAutomatica = null;
  @SerializedName("idProduto")
  private Long idProduto = null;
  @SerializedName("idGrupoDebitoRecorrente")
  private Long idGrupoDebitoRecorrente = null;
  @SerializedName("quantidadeTentativasCobranca")
  private Integer quantidadeTentativasCobranca = null;
  @SerializedName("idAjuste")
  private Long idAjuste = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getFlagAnuidadeBonificada() {
    return flagAnuidadeBonificada;
  }
  public void setFlagAnuidadeBonificada(Boolean flagAnuidadeBonificada) {
    this.flagAnuidadeBonificada = flagAnuidadeBonificada;
  }

  
  /**
   * Identification Code of the recurrent debit type (id)
   **/
  @ApiModelProperty(value = "Identification Code of the recurrent debit type (id)")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Description of the recurrent debit type
   **/
  @ApiModelProperty(value = "Description of the recurrent debit type")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * Value of the recurrent debit type
   **/
  @ApiModelProperty(value = "Value of the recurrent debit type")
  public BigDecimal getValor() {
    return valor;
  }
  public void setValor(BigDecimal valor) {
    this.valor = valor;
  }

  
  /**
   * Flag that identifies if the type of recurrent debit is active
   **/
  @ApiModelProperty(value = "Flag that identifies if the type of recurrent debit is active")
  public Boolean getFlagAtivo() {
    return flagAtivo;
  }
  public void setFlagAtivo(Boolean flagAtivo) {
    this.flagAtivo = flagAtivo;
  }

  
  /**
   * Bonus value referring to the plan
   **/
  @ApiModelProperty(value = "Bonus value referring to the plan")
  public BigDecimal getValorBonus() {
    return valorBonus;
  }
  public void setValorBonus(BigDecimal valorBonus) {
    this.valorBonus = valorBonus;
  }

  
  /**
   * Parcel Number referring to the plan
   **/
  @ApiModelProperty(value = "Parcel Number referring to the plan")
  public Integer getNumeroParcelas() {
    return numeroParcelas;
  }
  public void setNumeroParcelas(Integer numeroParcelas) {
    this.numeroParcelas = numeroParcelas;
  }

  
  /**
   * Flag that indicates if the renovation is going to be automatic
   **/
  @ApiModelProperty(value = "Flag that indicates if the renovation is going to be automatic")
  public Boolean getFlagAdereAutomatico() {
    return flagAdereAutomatico;
  }
  public void setFlagAdereAutomatico(Boolean flagAdereAutomatico) {
    this.flagAdereAutomatico = flagAdereAutomatico;
  }

  
  /**
   * Flag that indicates if the renewal is going to be automatic
   **/
  @ApiModelProperty(value = "Flag that indicates if the renewal is going to be automatic")
  public Boolean getFlagGeraNumeroSorte() {
    return flagGeraNumeroSorte;
  }
  public void setFlagGeraNumeroSorte(Boolean flagGeraNumeroSorte) {
    this.flagGeraNumeroSorte = flagGeraNumeroSorte;
  }

  
  /**
   * Indicates the age range to join to the plan
   **/
  @ApiModelProperty(value = "Indicates the age range to join to the plan")
  public String getFaixaEtaria() {
    return faixaEtaria;
  }
  public void setFaixaEtaria(String faixaEtaria) {
    this.faixaEtaria = faixaEtaria;
  }

  
  /**
   * Flag indicates if the plan is safe
   **/
  @ApiModelProperty(value = "Flag indicates if the plan is safe")
  public Boolean getFlagSeguro() {
    return flagSeguro;
  }
  public void setFlagSeguro(Boolean flagSeguro) {
    this.flagSeguro = flagSeguro;
  }

  
  /**
   * Indicates which award referring to the month
   **/
  @ApiModelProperty(value = "Indicates which award referring to the month")
  public String getSorteiosMensais() {
    return sorteiosMensais;
  }
  public void setSorteiosMensais(String sorteiosMensais) {
    this.sorteiosMensais = sorteiosMensais;
  }

  
  /**
   * Flag that indicates if the accession of the plan will be automatic
   **/
  @ApiModelProperty(value = "Flag that indicates if the accession of the plan will be automatic")
  public Boolean getFlagAdesaoAutomatica() {
    return flagAdesaoAutomatica;
  }
  public void setFlagAdesaoAutomatica(Boolean flagAdesaoAutomatica) {
    this.flagAdesaoAutomatica = flagAdesaoAutomatica;
  }

  
  /**
   * Flag indicate if the plan covers the dependent
   **/
  @ApiModelProperty(value = "Flag indicate if the plan covers the dependent")
  public Boolean getFlagDependente() {
    return flagDependente;
  }
  public void setFlagDependente(Boolean flagDependente) {
    this.flagDependente = flagDependente;
  }

  
  /**
   * Indicate dependent numbers
   **/
  @ApiModelProperty(value = "Indicate dependent numbers")
  public Integer getQuantidadeDependente() {
    return quantidadeDependente;
  }
  public void setQuantidadeDependente(Integer quantidadeDependente) {
    this.quantidadeDependente = quantidadeDependente;
  }

  
  /**
   * Identification Code of the security service term (id)
   **/
  @ApiModelProperty(value = "Identification Code of the security service term (id)")
  public Long getIdTermoSeguroServico() {
    return idTermoSeguroServico;
  }
  public void setIdTermoSeguroServico(Long idTermoSeguroServico) {
    this.idTermoSeguroServico = idTermoSeguroServico;
  }

  
  /**
   * Minimum age to join to the plan
   **/
  @ApiModelProperty(value = "Minimum age to join to the plan")
  public Integer getIdadeMinima() {
    return idadeMinima;
  }
  public void setIdadeMinima(Integer idadeMinima) {
    this.idadeMinima = idadeMinima;
  }

  
  /**
   * Maximum age to join to the plan
   **/
  @ApiModelProperty(value = "Maximum age to join to the plan")
  public Integer getIdadeMaxima() {
    return idadeMaxima;
  }
  public void setIdadeMaxima(Integer idadeMaxima) {
    this.idadeMaxima = idadeMaxima;
  }

  
  /**
   * Flag indicates if the plan will have an unconditional debit
   **/
  @ApiModelProperty(value = "Flag indicates if the plan will have an unconditional debit")
  public Boolean getFlagDebitoIncondicional() {
    return flagDebitoIncondicional;
  }
  public void setFlagDebitoIncondicional(Boolean flagDebitoIncondicional) {
    this.flagDebitoIncondicional = flagDebitoIncondicional;
  }

  
  /**
   * Flag that indicates if the plan will be unconditional extract
   **/
  @ApiModelProperty(value = "Flag that indicates if the plan will be unconditional extract")
  public Boolean getFlagExtratoIncondicional() {
    return flagExtratoIncondicional;
  }
  public void setFlagExtratoIncondicional(Boolean flagExtratoIncondicional) {
    this.flagExtratoIncondicional = flagExtratoIncondicional;
  }

  
  /**
   * Flag indicates if the plan will have any automatic reversal
   **/
  @ApiModelProperty(value = "Flag indicates if the plan will have any automatic reversal")
  public Boolean getFlagEstornoAutomatico() {
    return flagEstornoAutomatico;
  }
  public void setFlagEstornoAutomatico(Boolean flagEstornoAutomatico) {
    this.flagEstornoAutomatico = flagEstornoAutomatico;
  }

  
  /**
   * Value passed to the insurer
   **/
  @ApiModelProperty(value = "Value passed to the insurer")
  public BigDecimal getValorRepassadoSeguradora() {
    return valorRepassadoSeguradora;
  }
  public void setValorRepassadoSeguradora(BigDecimal valorRepassadoSeguradora) {
    this.valorRepassadoSeguradora = valorRepassadoSeguradora;
  }

  
  /**
   * Flag that indicates if it is going to launched a transaction
   **/
  @ApiModelProperty(value = "Flag that indicates if it is going to launched a transaction")
  public Boolean getFlagLancaTransacao() {
    return flagLancaTransacao;
  }
  public void setFlagLancaTransacao(Boolean flagLancaTransacao) {
    this.flagLancaTransacao = flagLancaTransacao;
  }

  
  /**
   * Flag that indicates if it is going to be made an automatic transfer
   **/
  @ApiModelProperty(value = "Flag that indicates if it is going to be made an automatic transfer")
  public Boolean getFlagTransferenciaAutomatica() {
    return flagTransferenciaAutomatica;
  }
  public void setFlagTransferenciaAutomatica(Boolean flagTransferenciaAutomatica) {
    this.flagTransferenciaAutomatica = flagTransferenciaAutomatica;
  }

  
  /**
   * Identification Code of the products (id)
   **/
  @ApiModelProperty(value = "Identification Code of the products (id)")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * Identification Code of the recurrent debit group (id)
   **/
  @ApiModelProperty(value = "Identification Code of the recurrent debit group (id)")
  public Long getIdGrupoDebitoRecorrente() {
    return idGrupoDebitoRecorrente;
  }
  public void setIdGrupoDebitoRecorrente(Long idGrupoDebitoRecorrente) {
    this.idGrupoDebitoRecorrente = idGrupoDebitoRecorrente;
  }

  
  /**
   * Attempt Quantities for the collection
   **/
  @ApiModelProperty(value = "Attempt Quantities for the collection")
  public Integer getQuantidadeTentativasCobranca() {
    return quantidadeTentativasCobranca;
  }
  public void setQuantidadeTentativasCobranca(Integer quantidadeTentativasCobranca) {
    this.quantidadeTentativasCobranca = quantidadeTentativasCobranca;
  }

  
  /**
   * Identification Code of the adjustment types (id)
   **/
  @ApiModelProperty(value = "Identification Code of the adjustment types (id)")
  public Long getIdAjuste() {
    return idAjuste;
  }
  public void setIdAjuste(Long idAjuste) {
    this.idAjuste = idAjuste;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TipoDebitoRecorrenteResponse {\n");
    
    sb.append("  flagAnuidadeBonificada: ").append(flagAnuidadeBonificada).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("  valor: ").append(valor).append("\n");
    sb.append("  flagAtivo: ").append(flagAtivo).append("\n");
    sb.append("  valorBonus: ").append(valorBonus).append("\n");
    sb.append("  numeroParcelas: ").append(numeroParcelas).append("\n");
    sb.append("  flagAdereAutomatico: ").append(flagAdereAutomatico).append("\n");
    sb.append("  flagGeraNumeroSorte: ").append(flagGeraNumeroSorte).append("\n");
    sb.append("  faixaEtaria: ").append(faixaEtaria).append("\n");
    sb.append("  flagSeguro: ").append(flagSeguro).append("\n");
    sb.append("  sorteiosMensais: ").append(sorteiosMensais).append("\n");
    sb.append("  flagAdesaoAutomatica: ").append(flagAdesaoAutomatica).append("\n");
    sb.append("  flagDependente: ").append(flagDependente).append("\n");
    sb.append("  quantidadeDependente: ").append(quantidadeDependente).append("\n");
    sb.append("  idTermoSeguroServico: ").append(idTermoSeguroServico).append("\n");
    sb.append("  idadeMinima: ").append(idadeMinima).append("\n");
    sb.append("  idadeMaxima: ").append(idadeMaxima).append("\n");
    sb.append("  flagDebitoIncondicional: ").append(flagDebitoIncondicional).append("\n");
    sb.append("  flagExtratoIncondicional: ").append(flagExtratoIncondicional).append("\n");
    sb.append("  flagEstornoAutomatico: ").append(flagEstornoAutomatico).append("\n");
    sb.append("  valorRepassadoSeguradora: ").append(valorRepassadoSeguradora).append("\n");
    sb.append("  flagLancaTransacao: ").append(flagLancaTransacao).append("\n");
    sb.append("  flagTransferenciaAutomatica: ").append(flagTransferenciaAutomatica).append("\n");
    sb.append("  idProduto: ").append(idProduto).append("\n");
    sb.append("  idGrupoDebitoRecorrente: ").append(idGrupoDebitoRecorrente).append("\n");
    sb.append("  quantidadeTentativasCobranca: ").append(quantidadeTentativasCobranca).append("\n");
    sb.append("  idAjuste: ").append(idAjuste).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
