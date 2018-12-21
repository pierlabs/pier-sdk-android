package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.ProdutoOrigemResponse;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Response Representation of the commercial origin resource
 **/
@ApiModel(description = "Response Representation of the commercial origin resource")
public class OrigemComercialResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("nome")
  private String nome = null;
  @SerializedName("descricao")
  private String descricao = null;
  @SerializedName("produtosOrigem")
  private List<ProdutoOrigemResponse> produtosOrigem = null;
  @SerializedName("idEstabelecimento")
  private Long idEstabelecimento = null;
  @SerializedName("idTipoOrigemComercial")
  private Long idTipoOrigemComercial = null;
  @SerializedName("nomeTipoOrigemComercial")
  private String nomeTipoOrigemComercial = null;
  @SerializedName("idGrupoOrigemComercial")
  private Long idGrupoOrigemComercial = null;
  @SerializedName("nomeGrupoOrigemComercial")
  private String nomeGrupoOrigemComercial = null;
  @SerializedName("status")
  private Integer status = null;
  @SerializedName("flagPreAprovado")
  private Boolean flagPreAprovado = null;
  @SerializedName("flagAprovacaoImediata")
  private Boolean flagAprovacaoImediata = null;
  @SerializedName("nomeFantasiaPlastico")
  private String nomeFantasiaPlastico = null;
  @SerializedName("flagCartaoProvisorio")
  private Boolean flagCartaoProvisorio = null;
  @SerializedName("flagCartaoDefinitivo")
  private Boolean flagCartaoDefinitivo = null;
  @SerializedName("usuario")
  private String usuario = null;
  @SerializedName("senha")
  private String senha = null;
  @SerializedName("flagOrigemExterna")
  private Boolean flagOrigemExterna = null;
  @SerializedName("flagModificado")
  private Boolean flagModificado = null;
  @SerializedName("flagEnviaFaturaUsuario")
  private Boolean flagEnviaFaturaUsuario = null;
  @SerializedName("flagCreditoFaturamento")
  private Boolean flagCreditoFaturamento = null;
  @SerializedName("flagConcedeLimiteProvisorio")
  private Boolean flagConcedeLimiteProvisorio = null;
  @SerializedName("flagDigitalizarDoc")
  private Boolean flagDigitalizarDoc = null;
  @SerializedName("flagEmbossingLoja")
  private Boolean flagEmbossingLoja = null;
  @SerializedName("flagConsultaPrevia")
  private Boolean flagConsultaPrevia = null;
  public enum TipoPessoaEnum {
     PESSOA_FISICA,  PESSOA_JURIDICA, 
  };
  @SerializedName("tipoPessoa")
  private TipoPessoaEnum tipoPessoa = null;

  
  /**
   * Identifier Code of the OriginCommercial
   **/
  @ApiModelProperty(value = "Identifier Code of the OriginCommercial")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Name of the Commercial Origin
   **/
  @ApiModelProperty(value = "Name of the Commercial Origin")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * Complete Description of the name of Commercial Origin
   **/
  @ApiModelProperty(value = "Complete Description of the name of Commercial Origin")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * Products of the commercial origin
   **/
  @ApiModelProperty(value = "Products of the commercial origin")
  public List<ProdutoOrigemResponse> getProdutosOrigem() {
    return produtosOrigem;
  }
  public void setProdutosOrigem(List<ProdutoOrigemResponse> produtosOrigem) {
    this.produtosOrigem = produtosOrigem;
  }

  
  /**
   * Identification Code of the Merchant
   **/
  @ApiModelProperty(value = "Identification Code of the Merchant")
  public Long getIdEstabelecimento() {
    return idEstabelecimento;
  }
  public void setIdEstabelecimento(Long idEstabelecimento) {
    this.idEstabelecimento = idEstabelecimento;
  }

  
  /**
   * Identification Code of the type of Commercial Origin
   **/
  @ApiModelProperty(value = "Identification Code of the type of Commercial Origin")
  public Long getIdTipoOrigemComercial() {
    return idTipoOrigemComercial;
  }
  public void setIdTipoOrigemComercial(Long idTipoOrigemComercial) {
    this.idTipoOrigemComercial = idTipoOrigemComercial;
  }

  
  /**
   * Name of Type of the Commercial Origin
   **/
  @ApiModelProperty(value = "Name of Type of the Commercial Origin")
  public String getNomeTipoOrigemComercial() {
    return nomeTipoOrigemComercial;
  }
  public void setNomeTipoOrigemComercial(String nomeTipoOrigemComercial) {
    this.nomeTipoOrigemComercial = nomeTipoOrigemComercial;
  }

  
  /**
   * Group identifier of the Commercial Origin
   **/
  @ApiModelProperty(value = "Group identifier of the Commercial Origin")
  public Long getIdGrupoOrigemComercial() {
    return idGrupoOrigemComercial;
  }
  public void setIdGrupoOrigemComercial(Long idGrupoOrigemComercial) {
    this.idGrupoOrigemComercial = idGrupoOrigemComercial;
  }

  
  /**
   * Group Name of the Commercial Origin
   **/
  @ApiModelProperty(value = "Group Name of the Commercial Origin")
  public String getNomeGrupoOrigemComercial() {
    return nomeGrupoOrigemComercial;
  }
  public void setNomeGrupoOrigemComercial(String nomeGrupoOrigemComercial) {
    this.nomeGrupoOrigemComercial = nomeGrupoOrigemComercial;
  }

  
  /**
   * Indicate the status of the Commercial Origin
   **/
  @ApiModelProperty(value = "Indicate the status of the Commercial Origin")
  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
    this.status = status;
  }

  
  /**
   * Indicate if it allows pre approval
   **/
  @ApiModelProperty(value = "Indicate if it allows pre approval")
  public Boolean getFlagPreAprovado() {
    return flagPreAprovado;
  }
  public void setFlagPreAprovado(Boolean flagPreAprovado) {
    this.flagPreAprovado = flagPreAprovado;
  }

  
  /**
   * Indicate if it allows immediate approval
   **/
  @ApiModelProperty(value = "Indicate if it allows immediate approval")
  public Boolean getFlagAprovacaoImediata() {
    return flagAprovacaoImediata;
  }
  public void setFlagAprovacaoImediata(Boolean flagAprovacaoImediata) {
    this.flagAprovacaoImediata = flagAprovacaoImediata;
  }

  
  /**
   * Fantasy Name printed on plastic
   **/
  @ApiModelProperty(value = "Fantasy Name printed on plastic")
  public String getNomeFantasiaPlastico() {
    return nomeFantasiaPlastico;
  }
  public void setNomeFantasiaPlastico(String nomeFantasiaPlastico) {
    this.nomeFantasiaPlastico = nomeFantasiaPlastico;
  }

  
  /**
   * Indicate if it allows provisory card
   **/
  @ApiModelProperty(value = "Indicate if it allows provisory card")
  public Boolean getFlagCartaoProvisorio() {
    return flagCartaoProvisorio;
  }
  public void setFlagCartaoProvisorio(Boolean flagCartaoProvisorio) {
    this.flagCartaoProvisorio = flagCartaoProvisorio;
  }

  
  /**
   * Indicate if it allows definitive card
   **/
  @ApiModelProperty(value = "Indicate if it allows definitive card")
  public Boolean getFlagCartaoDefinitivo() {
    return flagCartaoDefinitivo;
  }
  public void setFlagCartaoDefinitivo(Boolean flagCartaoDefinitivo) {
    this.flagCartaoDefinitivo = flagCartaoDefinitivo;
  }

  
  /**
   * User for the authentication
   **/
  @ApiModelProperty(value = "User for the authentication")
  public String getUsuario() {
    return usuario;
  }
  public void setUsuario(String usuario) {
    this.usuario = usuario;
  }

  
  /**
   * Authentication Password
   **/
  @ApiModelProperty(value = "Authentication Password")
  public String getSenha() {
    return senha;
  }
  public void setSenha(String senha) {
    this.senha = senha;
  }

  
  /**
   * Indicate if it is external origin
   **/
  @ApiModelProperty(value = "Indicate if it is external origin")
  public Boolean getFlagOrigemExterna() {
    return flagOrigemExterna;
  }
  public void setFlagOrigemExterna(Boolean flagOrigemExterna) {
    this.flagOrigemExterna = flagOrigemExterna;
  }

  
  /**
   * Indicate if there is modification
   **/
  @ApiModelProperty(value = "Indicate if there is modification")
  public Boolean getFlagModificado() {
    return flagModificado;
  }
  public void setFlagModificado(Boolean flagModificado) {
    this.flagModificado = flagModificado;
  }

  
  /**
   * Indicate if it sends invoice
   **/
  @ApiModelProperty(value = "Indicate if it sends invoice")
  public Boolean getFlagEnviaFaturaUsuario() {
    return flagEnviaFaturaUsuario;
  }
  public void setFlagEnviaFaturaUsuario(Boolean flagEnviaFaturaUsuario) {
    this.flagEnviaFaturaUsuario = flagEnviaFaturaUsuario;
  }

  
  /**
   * Indicate if it allows the billing credit
   **/
  @ApiModelProperty(value = "Indicate if it allows the billing credit")
  public Boolean getFlagCreditoFaturamento() {
    return flagCreditoFaturamento;
  }
  public void setFlagCreditoFaturamento(Boolean flagCreditoFaturamento) {
    this.flagCreditoFaturamento = flagCreditoFaturamento;
  }

  
  /**
   * Indicate if it grants provisory limit
   **/
  @ApiModelProperty(value = "Indicate if it grants provisory limit")
  public Boolean getFlagConcedeLimiteProvisorio() {
    return flagConcedeLimiteProvisorio;
  }
  public void setFlagConcedeLimiteProvisorio(Boolean flagConcedeLimiteProvisorio) {
    this.flagConcedeLimiteProvisorio = flagConcedeLimiteProvisorio;
  }

  
  /**
   * Indicate if it digitalizes document
   **/
  @ApiModelProperty(value = "Indicate if it digitalizes document")
  public Boolean getFlagDigitalizarDoc() {
    return flagDigitalizarDoc;
  }
  public void setFlagDigitalizarDoc(Boolean flagDigitalizarDoc) {
    this.flagDigitalizarDoc = flagDigitalizarDoc;
  }

  
  /**
   * Indicate if it makes embossing in the store
   **/
  @ApiModelProperty(value = "Indicate if it makes embossing in the store")
  public Boolean getFlagEmbossingLoja() {
    return flagEmbossingLoja;
  }
  public void setFlagEmbossingLoja(Boolean flagEmbossingLoja) {
    this.flagEmbossingLoja = flagEmbossingLoja;
  }

  
  /**
   * Indicate if it makes the prior retrieve
   **/
  @ApiModelProperty(value = "Indicate if it makes the prior retrieve")
  public Boolean getFlagConsultaPrevia() {
    return flagConsultaPrevia;
  }
  public void setFlagConsultaPrevia(Boolean flagConsultaPrevia) {
    this.flagConsultaPrevia = flagConsultaPrevia;
  }

  
  /**
   * Person type
   **/
  @ApiModelProperty(value = "Person type")
  public TipoPessoaEnum getTipoPessoa() {
    return tipoPessoa;
  }
  public void setTipoPessoa(TipoPessoaEnum tipoPessoa) {
    this.tipoPessoa = tipoPessoa;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrigemComercialResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("  descricao: ").append(descricao).append("\n");
    sb.append("  produtosOrigem: ").append(produtosOrigem).append("\n");
    sb.append("  idEstabelecimento: ").append(idEstabelecimento).append("\n");
    sb.append("  idTipoOrigemComercial: ").append(idTipoOrigemComercial).append("\n");
    sb.append("  nomeTipoOrigemComercial: ").append(nomeTipoOrigemComercial).append("\n");
    sb.append("  idGrupoOrigemComercial: ").append(idGrupoOrigemComercial).append("\n");
    sb.append("  nomeGrupoOrigemComercial: ").append(nomeGrupoOrigemComercial).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  flagPreAprovado: ").append(flagPreAprovado).append("\n");
    sb.append("  flagAprovacaoImediata: ").append(flagAprovacaoImediata).append("\n");
    sb.append("  nomeFantasiaPlastico: ").append(nomeFantasiaPlastico).append("\n");
    sb.append("  flagCartaoProvisorio: ").append(flagCartaoProvisorio).append("\n");
    sb.append("  flagCartaoDefinitivo: ").append(flagCartaoDefinitivo).append("\n");
    sb.append("  usuario: ").append(usuario).append("\n");
    sb.append("  senha: ").append(senha).append("\n");
    sb.append("  flagOrigemExterna: ").append(flagOrigemExterna).append("\n");
    sb.append("  flagModificado: ").append(flagModificado).append("\n");
    sb.append("  flagEnviaFaturaUsuario: ").append(flagEnviaFaturaUsuario).append("\n");
    sb.append("  flagCreditoFaturamento: ").append(flagCreditoFaturamento).append("\n");
    sb.append("  flagConcedeLimiteProvisorio: ").append(flagConcedeLimiteProvisorio).append("\n");
    sb.append("  flagDigitalizarDoc: ").append(flagDigitalizarDoc).append("\n");
    sb.append("  flagEmbossingLoja: ").append(flagEmbossingLoja).append("\n");
    sb.append("  flagConsultaPrevia: ").append(flagConsultaPrevia).append("\n");
    sb.append("  tipoPessoa: ").append(tipoPessoa).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
