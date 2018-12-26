package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.ArquivoParametroResponse;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto Response do arquivo
 **/
@ApiModel(description = "Objeto Response do arquivo")
public class ArquivoResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idTipoArquivo")
  private Long idTipoArquivo = null;
  @SerializedName("nomeTipoArquivo")
  private String nomeTipoArquivo = null;
  @SerializedName("idStatusArquivo")
  private Long idStatusArquivo = null;
  @SerializedName("nomeStatusArquivo")
  private String nomeStatusArquivo = null;
  @SerializedName("nome")
  private String nome = null;
  @SerializedName("extensao")
  private String extensao = null;
  @SerializedName("dataInclusao")
  private String dataInclusao = null;
  @SerializedName("dataAlteracao")
  private String dataAlteracao = null;
  @SerializedName("detalhes")
  private List<ArquivoParametroResponse> detalhes = null;

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do arquivo
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o do arquivo")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do Tipo do arquivo
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o do Tipo do arquivo")
  public Long getIdTipoArquivo() {
    return idTipoArquivo;
  }
  public void setIdTipoArquivo(Long idTipoArquivo) {
    this.idTipoArquivo = idTipoArquivo;
  }

  
  /**
   * Descri\u00E7\u00E3o do tipo do arquivo
   **/
  @ApiModelProperty(value = "Descri\u00E7\u00E3o do tipo do arquivo")
  public String getNomeTipoArquivo() {
    return nomeTipoArquivo;
  }
  public void setNomeTipoArquivo(String nomeTipoArquivo) {
    this.nomeTipoArquivo = nomeTipoArquivo;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do Status do arquivo
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o do Status do arquivo")
  public Long getIdStatusArquivo() {
    return idStatusArquivo;
  }
  public void setIdStatusArquivo(Long idStatusArquivo) {
    this.idStatusArquivo = idStatusArquivo;
  }

  
  /**
   * Desci\u00E7\u00E3o do status do arquivo
   **/
  @ApiModelProperty(value = "Desci\u00E7\u00E3o do status do arquivo")
  public String getNomeStatusArquivo() {
    return nomeStatusArquivo;
  }
  public void setNomeStatusArquivo(String nomeStatusArquivo) {
    this.nomeStatusArquivo = nomeStatusArquivo;
  }

  
  /**
   * Nome do arquivo
   **/
  @ApiModelProperty(value = "Nome do arquivo")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * Formato/Extens\u00E3o do arquivo
   **/
  @ApiModelProperty(value = "Formato/Extens\u00E3o do arquivo")
  public String getExtensao() {
    return extensao;
  }
  public void setExtensao(String extensao) {
    this.extensao = extensao;
  }

  
  /**
   * Data de inclus\u00E3o do arquivo
   **/
  @ApiModelProperty(value = "Data de inclus\u00E3o do arquivo")
  public String getDataInclusao() {
    return dataInclusao;
  }
  public void setDataInclusao(String dataInclusao) {
    this.dataInclusao = dataInclusao;
  }

  
  /**
   * Data da \u00FAltima altera\u00E7\u00E3o do aquivo
   **/
  @ApiModelProperty(value = "Data da \u00FAltima altera\u00E7\u00E3o do aquivo")
  public String getDataAlteracao() {
    return dataAlteracao;
  }
  public void setDataAlteracao(String dataAlteracao) {
    this.dataAlteracao = dataAlteracao;
  }

  
  /**
   * Detalhes contendo informa\u00E7\u00F5es adicionais, relacionadas ao arquivo
   **/
  @ApiModelProperty(value = "Detalhes contendo informa\u00E7\u00F5es adicionais, relacionadas ao arquivo")
  public List<ArquivoParametroResponse> getDetalhes() {
    return detalhes;
  }
  public void setDetalhes(List<ArquivoParametroResponse> detalhes) {
    this.detalhes = detalhes;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArquivoResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idTipoArquivo: ").append(idTipoArquivo).append("\n");
    sb.append("  nomeTipoArquivo: ").append(nomeTipoArquivo).append("\n");
    sb.append("  idStatusArquivo: ").append(idStatusArquivo).append("\n");
    sb.append("  nomeStatusArquivo: ").append(nomeStatusArquivo).append("\n");
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("  extensao: ").append(extensao).append("\n");
    sb.append("  dataInclusao: ").append(dataInclusao).append("\n");
    sb.append("  dataAlteracao: ").append(dataAlteracao).append("\n");
    sb.append("  detalhes: ").append(detalhes).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
