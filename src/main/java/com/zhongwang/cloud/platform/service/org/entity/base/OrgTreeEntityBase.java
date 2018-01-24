package com.zhongwang.cloud.platform.service.org.entity.base;

import com.fasterxml.jackson.annotation.JsonBackReference;

import java.util.ArrayList;
import java.util.List;

/**
 * 树形父类
 *
 * @Author :  zhujinhua
 * @Date : 2017-12-26 13:54
 */
public abstract class OrgTreeEntityBase<T extends OrgTreeEntityBase<T>> extends OrgEntityBase {
	
	protected T parent;
	
	protected List<T> children;
	
	protected List<T> fullChildren;
	
	protected int level;
	
	protected boolean isEndlevel;
	
	/**
	 * 用于构造树形结构使用的父级节点pkid
	 */
	protected String parentPkid;
	
	/**
	 * 记录完整的父级路径，用\符号分割
	 */
	protected String parentPath;
	
	public OrgTreeEntityBase() {
		this.children = new ArrayList<T>();
		this.fullChildren = new ArrayList<T>();
	}
	
	public String getParentPath() {
		return parentPath;
	}
	
	public void setParentPath(String parentPath) {
		this.parentPath = parentPath;
	}
	
	
	public boolean isEndlevel() {
//		return children.isEmpty();
		return isEndlevel;
	}
	
	/*for json Serialization*/
	public void setEndlevel(boolean isEndlevel) {
		this.isEndlevel = isEndlevel;
	}
	
	@JsonBackReference /*此注解非常重要，为了避免json循环引用报json infinite recursion stackoverflowerror错*/
	public T getParent() {
		return parent;
	}
	
	@JsonBackReference /*此注解非常重要，为了避免json循环引用报json infinite recursion stackoverflowerror错*/
	public void setParent(T parent) {
		this.parent = parent;
	}
	
	/**
	 * getter method
	 *
	 * @return the level
	 */
	public int getLevel() {
		return level;
	}
	
	/**
	 * setter method
	 *
	 * @param level the level to set
	 */
	void setLevel(int level) {
		this.level = level;
		this.getChildren().forEach(each -> each.setLevel(level + 1));
	}
	
	/**
	 * getter method
	 *
	 * @return the children
	 */
	public List<T> getChildren() {
		return children;
	}
	
	@SuppressWarnings("unchecked")
	public List<T> getFullChildren() {
		fullChildren.clear();
		fullChildren.addAll(children);
		for (T child : children) {
			fullChildren.addAll(child.getFullChildren());
		}
		return fullChildren;
	}
	
	/**
	 * @Description: 重新构建上级结构，赋值给parent_path属性。 (这里描述这个方法适用条件、执行流程、使用方法、注意事项 –
	 * 可选) @param @param parentPath 设定文件 @return void 返回类型 @throws
	 */
	protected void rebuildParentPath(String parentPath) {
		this.parentPath = parentPath + "\\" + getParentPkid();
		for (T child : children) {
			child.rebuildParentPath(this.parentPath);
		}
	}
	
	/**
	 * setter method
	 *
	 * @param children the children to set
	 */
	public void setChildren(List<T> children) {
		this.children = children;
	}
	
	/**
	 * getter method
	 *
	 * @return the parentPkid
	 */
	public String getParentPkid() {
		return parentPkid;
	}
	
	/**
	 * setter method
	 *
	 * @param parentPkid the parentPkid to set
	 */
	public void setParentPkid(String parentPkid) {
		this.parentPkid = parentPkid;
	}
	
	/**
	 * get t's all parent list.
	 *
	 * @return t's all parent list.
	 */
	public List<T> getNodeAllParentNodes(boolean isContainRoot) {
		List<T> nodeAllParentNodes = new ArrayList<>();
		T parent = getParent();
		if (null == parent) { // current node is root
			return nodeAllParentNodes;
		}
		recursionAddParentNode(parent, isContainRoot, nodeAllParentNodes);
		return nodeAllParentNodes;
	}
	
	/**
	 * recursion Add Parent Node
	 *
	 * @param t                  node
	 * @param isContainRoot      is contain root node
	 * @param nodeAllParentNodes t's all parent list
	 */
	private void recursionAddParentNode(T t, boolean isContainRoot, List<T> nodeAllParentNodes) {
		
		if (null == t) {
			return;
		}
		
		T parent = t.getParent();
		
		if (null == parent) { // t is root
			if (isContainRoot) {
				if (!nodeAllParentNodes.contains(t)) {
					nodeAllParentNodes.add(t);
				}
				return;
			}
		} else {
			T grandfather = parent.getParent();
			if (null == grandfather) { // parent is root
				if (isContainRoot) {
					if (!nodeAllParentNodes.contains(parent)) {
						nodeAllParentNodes.add(parent);
					}
					return;
				}
			} else {
				if (!nodeAllParentNodes.contains(parent)) {
					nodeAllParentNodes.add(parent);
				}
				recursionAddParentNode(parent, isContainRoot, nodeAllParentNodes);
			}
			
		}
		
	}
}
